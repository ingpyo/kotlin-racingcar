package support

class EnergyGenerator : RandomNumberGenerator {
    override fun generate(): Int {
        return (MIN_ENERGY..MAX_ENERGY).random()
    }

    companion object{
        private const val MIN_ENERGY = 0
        private const val MAX_ENERGY = 9
    }
}
