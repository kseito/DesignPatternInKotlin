package factory.method

class Bakudan : Enemy() {
    override fun attack() {
        println("爆弾を発射！")
    }

    override fun move() {
        println("ちょっと移動")
    }

    override fun appear() {
        println("バクダンが現れた！")
    }

}