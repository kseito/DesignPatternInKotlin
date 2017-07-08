package factory.method

class BakudanFactory : Factory() {
    override fun createEnemy(): Enemy {
        return Bakudan()
    }

    override fun deployToMap(enemy: Enemy) {
        enemy.appear()
    }

}