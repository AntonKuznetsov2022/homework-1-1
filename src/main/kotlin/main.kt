fun main () {
    val transferAmount: Double = 4170.50
    val commission: Double = 0.0075
    var ammount: Double = 0.0

    if (transferAmount * commission<35) ammount = 35.0 else ammount = transferAmount * commission

    println("Комиcсия равна: ${String.format("%.2f", ammount)} руб.")
}cd