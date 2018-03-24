package iterator

fun main(args: Array<String>) {
    val list: WeponList = WeponList(5)
    list.add(Weapon("わかばシューター", 32, 32, 75))
    list.add(Weapon("スプラシューターコラボ", 50, 45, 55))
    list.add(Weapon(".96ガロンデコ", 68, 85, 15))
    list.add(Weapon("カーボンローラー", 20, 65, 70))
    list.add(Weapon("ダイナモローラー", 72, 30, 20))

    val weponSelect: Iterator = list.iterator()
    while (weponSelect.hasNext()) {
        val wepon: Weapon = weponSelect.next() as Weapon
        System.out.println("武器名:" + wepon.name + "、射程:" + wepon.range + "、攻撃力:" + wepon.power +
                "、連射力:" + wepon.quickness)
    }
}