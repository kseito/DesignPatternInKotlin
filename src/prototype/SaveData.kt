package prototype

class SaveData(val user: User, val games: Array<String>) : Cloneable {
    fun createClone(): SaveData {
        return clone() as SaveData
    }

    fun print() {
        println("id:" + user.id)
        println("name:" + user.name)
        println("registered game datas:")
        games.forEach { println(it) }
    }
}