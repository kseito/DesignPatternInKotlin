package adapter

fun main(args: Array<String>) {

    //before
    val roller : SplaRoller = SplaRoller()
    println(roller.swing())

    //after
    val newRoller : SplaRoller2 = NewSplaRoller()
    println(newRoller.swingHorizontal())
    println(newRoller.swingVertical())
}