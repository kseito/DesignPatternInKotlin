package prototype

fun main(args: Array<String>) {
    val user = User(123, "seito")
    var games:Array<String> = arrayOf("Splatoon2", "Mario Kart")
    val manager: SaveDataManager = SaveDataManager()

    val newSaveData = manager.create(user, games)
    newSaveData.print()

    val copiedSaveData = manager.copy(newSaveData)
    copiedSaveData.print()
}