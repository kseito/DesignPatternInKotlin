package template

fun main(args: Array<String>) {

    val players = arrayOf(
            Player("プレイヤー1", 15, "A+", 1270, "ダイナモローラー"),
            Player("プレイヤー2", 15, "A", 800, "スプラスピナーコラボ"),
            Player("プレイヤー3", 15, "S", 500, "スプラスコープ"),
            Player("プレイヤー4", 15, "A-", 940, "わかばシューター"))

    println("ナワバリバトルの結果")
    val nawabariResult: NawabariBattleResult = NawabariBattleResult()
    nawabariResult.show(players)

    println("\n\nガチバトルの結果")
    val gachiResult: GachiBattleResult = GachiBattleResult()
    gachiResult.show(players)
}