package adapter

class NewSplaRoller : SplaRoller(), SplaRoller2 {
    override fun swingHorizontal(): String {
        return "Horizontal " + swing()
    }

    override fun swingVertical(): String {
        return "Vertical " + swing()
    }

}