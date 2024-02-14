package racingcar.domain.car

class Car(val name: CarName) {

    var position: CarPosition = CarPosition()
        private set

    fun move(energy: Int) {
        if (isMove(energy)) {
            position = position.add()
        }
    }

    private fun isMove(energy: Int): Boolean {
        return energy >= MIN_ENERGY_THRESHOLD
    }

    companion object{
        const val MIN_ENERGY_THRESHOLD = 4
    }
}
