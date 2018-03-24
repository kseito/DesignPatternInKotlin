package iterator

class WeponList(count: Int): Aggreagte {

    override fun iterator(): Iterator {
        return WeponIterator(this)
    }

    private var wepons: Array<Weapon?> = arrayOfNulls(count)
    private var count: Int = 0

    fun add(wepon: Weapon) {
        wepons[count] = wepon
        count++
    }

    fun getWeponAt(index: Int): Weapon? {
        return wepons[index]
    }

    fun getCount(): Int {
        return count
    }
}