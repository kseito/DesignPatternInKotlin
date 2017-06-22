package template

class GachiBattleResult : GameResult() {
    override fun showScore(player: Player) {
        println("" + getScoreByUdemae(player.udemae) + "ポイント獲得しました！")
    }

    override fun showTeamResult(players: Array<Player>) {
        for (player in players) {
            println(player.wepon + ", " + player.name + ", " + player.rank)
        }
    }

    //ノックアウトは考慮しない
    private fun getScoreByUdemae(udemae: String): Int {
        when (udemae) {
            "C-" -> return 1000
            "C" -> return 1300
            "C+" -> return 1600
            "B-" -> return 2000
            "B" -> return 2300
            "B+" -> return 2600
            "A-" -> return 3000
            "A" -> return 3300
            "A+" -> return 3600
            "S" -> return 4000
            else -> return 5000
        }
    }
}
