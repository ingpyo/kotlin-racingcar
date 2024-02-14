package racingcar.domain.car

data class CarName(val name: String) {

    init {
        validateCarName()
    }

    private fun validateCarName() {
        if (name.length > MAX_CAR_NAME_SIZE) {
            throw IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.")
        }
    }

    companion object{
        const val MAX_CAR_NAME_SIZE = 5
    }
}
