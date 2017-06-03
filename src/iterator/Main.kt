package iterator

fun main(args: Array<String>) {
    val list: WeponList = WeponList(5)
    list.add(Wepon("わかばシューター", 32, 32, 75))
    list.add(Wepon("スプラシューターコラボ", 50, 45, 55))
    list.add(Wepon(".96ガロンデコ", 68, 85, 15))
    list.add(Wepon("カーボンローラー", 20, 65, 70))
    list.add(Wepon("ダイナモローラー", 72, 30, 20))

    val weponSelect: Iterator = list.iterator()
    while (weponSelect.hasNext()) {
        val wepon: Wepon = weponSelect.next() as Wepon
        System.out.println("武器名:" + wepon.name + "、射程:" + wepon.range + "、攻撃力:" + wepon.power +
                "、連射力:" + wepon.quickness)
    }
}