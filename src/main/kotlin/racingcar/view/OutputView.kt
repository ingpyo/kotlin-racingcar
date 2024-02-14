package racingcar.view

import racingcar.domain.car.Car
import racingcar.domain.car.CarPosition

object OutputView {
    fun printProgress(progressResult: MutableList<Map<Car, CarPosition>>) {
        println("실행 결과")
        progressResult.forEach {
            it -> it.forEach { println("${it.key.name.name} : " + "-".repeat(it.value.position)) }
            println()
        }
    }

    fun printWinner(winners: List<Car>) {
        print("최종 우승자: ")
        winners.joinTo(System.out, ", ") { it.name.name }
    }
}