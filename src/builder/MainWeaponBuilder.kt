package builder

abstract class MainWeaponBuilder {
    abstract fun name(name: String)
    abstract fun range(range: Int)
    abstract fun power(power: Int)
    abstract fun quickness(quickness: Int)
}