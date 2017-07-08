package factory.method

fun main(args: Array<String>) {
    var factory = BakudanFactory()
    var enemy = factory.create()

    enemy.move()
    enemy.attack()
}
