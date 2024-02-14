package racingcar.service

import racingcar.domain.resultgame.ResultGame
import racingcar.domain.car.Cars
import racingcar.domain.retrycount.RetryCount

class RacingStadium (
    private val cars: Cars,
    private val retryCount: RetryCount
){
    fun start() : ResultGame {
        return cars.startGame(retryCount)
    }
}