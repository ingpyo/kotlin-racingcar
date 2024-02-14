package racingcar.domain.car

data class CarPosition(val position: Int = STARTING_LINE) {

    fun add(): CarPosition {
        return CarPosition(position + 1)
    }
    companion object{
        const val STARTING_LINE = 0
    }
}
