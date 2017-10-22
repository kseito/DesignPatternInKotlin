package singleton

class Spiky {

    private constructor() {}

    var delivery: Delivery? = null

    companion object {
        val spiky = Spiky()
        fun getInstance(): Spiky {
            return spiky
        }
    }

    fun receiveDelivery(delivery: Delivery) {
        this.delivery = delivery
    }

    fun requestReceiveOrder() {
        delivery?.let { println(it.name + "が届いてるぜ！") }
                ?: println("そんなものはない")
    }
}