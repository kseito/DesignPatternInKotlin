package prototype

class SaveDataManager {
    fun create(user: User, games: Array<String>): SaveData {
        return SaveData(user, games)
    }

    fun copy(data: SaveData):SaveData {
        return data.createClone()
    }
}