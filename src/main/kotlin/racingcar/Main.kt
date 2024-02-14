package racingcar

import racingcar.service.RacingStadium
import racingcar.domain.retrycount.RetryCount
import racingcar.domain.car.Car
import racingcar.domain.car.CarName
import racingcar.domain.car.Cars
import racingcar.view.InputView
import racingcar.view.OutputView
import support.EnergyGenerator

fun main() {
    val inputCarNames = InputView.readCarName()
    val inputRetryCount = InputView.readRetryCount()

    val cars = Cars(makeCars(inputCarNames), EnergyGenerator())
    val retryCount = RetryCount(inputRetryCount)

    val racingStadium = RacingStadium(cars, retryCount)
    val resultGame = racingStadium.start()

    OutputView.printProgress(resultGame.progressResult)
    OutputView.printWinner(resultGame.getWinner())
}

private fun makeCars(carNames: List<String>) = carNames.map { Car(CarName(it)) }
