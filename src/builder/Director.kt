package builder

class Director(private val builder: MainWeaponBuilder) {
    fun construct() {
        builder.name(".96ガロン")
        builder.power(62)
        builder.range(31)
        builder.quickness(10)
    }
}