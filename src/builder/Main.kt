package builder

fun main(args: Array<String>) {
    val unmarkedBuilder = UnmarkedWeaponBuilder()
    var director = Director(unmarkedBuilder)
    director.construct()
    println(unmarkedBuilder.getResult())

    val decoratorBuilder = DecoratorWeaponBuilder()
    director = Director(decoratorBuilder)
    director.construct()
    println(decoratorBuilder.getResult())
}