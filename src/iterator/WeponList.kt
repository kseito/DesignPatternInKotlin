package iterator

class WeponList(count: Int): Aggreagte {

    override fun iterator(): Iterator {
        return WeponIterator(this)
    }

    private var wepons: Array<Wepon?> = arrayOfNulls(count)
    private var count: Int = 0

    fun add(wepon: Wepon) {
        wepons[count] = wepon
        count++
    }

    fun getWeponAt(index: Int): Wepon? {
        return wepons[index]
    }

    fun getCount(): Int {
        return count
    }
}