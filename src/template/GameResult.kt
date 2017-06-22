package template

abstract class GameResult {
    abstract fun showScore(player: Player)
    abstract fun showTeamResult(players: Array<Player>)

    fun show(players: Array<Player>) {

        //一人目のプレイヤーが自分自身
        showScore(players[0])

        showTeamResult(players)
    }
}