package iterator

class WeponIterator(private val weponList: WeponList) : Iterator {

    private var index: Int = 0

    override fun next(): Any {
        val wepon: Weapon? = weponList.getWeponAt(index)
        index++
        return wepon ?: Weapon("未開放", 0, 0, 0)
    }

    override fun hasNext(): Boolean {
        return weponList.getCount() > index
    }

}