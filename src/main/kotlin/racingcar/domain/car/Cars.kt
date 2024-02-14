package racingcar.domain.car

import support.RandomNumberGenerator
import racingcar.domain.resultgame.ResultGame
import racingcar.domain.retrycount.RetryCount

class Cars(
    val cars: List<Car>,
    private val randomNumberGenerator: RandomNumberGenerator
) {
    fun startGame(retryCount: RetryCount): ResultGame {
        val mutableListOf = mutableListOf<Map<Car, CarPosition>>()
        repeat(retryCount.count) {
            val progress = cars.associateWith { car ->
                car.move(randomNumberGenerator.generate())
                car.position
            }
            mutableListOf.add(progress)
        }
        return ResultGame(mutableListOf)
    }
}