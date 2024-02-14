package racingcar.view

object InputView {
    fun readCarName(): List<String> {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
        val inputCarNames = readlnOrNull() ?: throw IllegalArgumentException("자동차의 이름을 입력해 주세요.")
        return splitInputCarName(inputCarNames)
    }

    fun readRetryCount(): Int {
        println("시도할 회수는 몇회인가요?")
        val inputRetryCount = readlnOrNull() ?: throw IllegalArgumentException("시도할 횟수를 입력해 주세요.")
        return toInt(inputRetryCount)
    }

    private fun toInt(inputRetryCount: String): Int {
        return inputRetryCount.toIntOrNull() ?: throw IllegalArgumentException("시도할 횟수는 자연수로 입력해 주세요.")
    }

    private fun splitInputCarName(inputCarNames: String) = inputCarNames.split(", ").map { it.trim() }
}
