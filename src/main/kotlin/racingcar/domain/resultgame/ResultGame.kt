package racingcar.domain.resultgame

import racingcar.domain.car.Car
import racingcar.domain.car.CarPosition

class ResultGame(val progressResult: MutableList<Map<Car, CarPosition>>) {
    fun getWinner(): List<Car> {
        val lastRound = progressResult.last()
        return lastRound.filter { it.value == findMaxPosition(lastRound) }.keys.toList()
    }

    private fun findMaxPosition(lastRound: Map<Car, CarPosition>): CarPosition {
        return lastRound.values.maxBy { it.position }
    }
}
