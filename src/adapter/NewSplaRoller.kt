package adapter

/**
 * Created by kazuto.seito on 2017/06/09.
 */
class NewSplaRoller : SplaRoller(), SplaRoller2 {
    override fun swingHorizontal(): String {
        return "Horizontal " + swing()
    }

    override fun swingVertical(): String {
        return "Vertical " + swing()
    }

}