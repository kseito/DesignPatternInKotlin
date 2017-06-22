package template

class NawabariBattleResult: GameResult() {
    override fun showScore(player: Player) {
        println("" + player.score + "ポイント獲得しました！")
    }

    override fun showTeamResult(players: Array<Player>) {
        for (player in players) {
            println("" + player.rank + ", "  + player.wepon + ", " + player.name + ", " + player.score)
        }
    }

}