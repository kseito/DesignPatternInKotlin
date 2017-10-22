package singleton

fun main(args: Array<String>) {

    val spiky = Spiky.getInstance()
    spiky.requestReceiveOrder()
    spiky.receiveDelivery(Delivery(1, "ガチガサネ"))

    val spiky2 = Spiky.getInstance()
    spiky2.requestReceiveOrder()
}