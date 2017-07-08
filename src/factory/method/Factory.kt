package factory.method

abstract class Factory {
    fun create() : Enemy {
        var enemy = createEnemy()
        deployToMap(enemy)
        return enemy
    }

    abstract fun createEnemy() : Enemy
    abstract fun deployToMap(enemy: Enemy)
}