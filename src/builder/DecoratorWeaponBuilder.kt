package builder

import iterator.Weapon

class DecoratorWeaponBuilder : MainWeaponBuilder() {

    var name: String? = null
    var range: Int = 0
    var power: Int = 0
    var quickness: Int = 0

    override fun name(name: String) {
        this.name = "${name}デコ"
    }

    override fun range(range: Int) {
        this.range = range
    }

    override fun power(power: Int) {
        this.power = power
    }

    override fun quickness(quickness: Int) {
        this.quickness = quickness
    }

    fun getResult(): Weapon {
        return Weapon(name!!, range, power, quickness)
    }
}