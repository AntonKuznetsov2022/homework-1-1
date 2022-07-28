fun main () {
    val transferAmount: Double = 4670.50
    val commission: Double = 0.0075
    var ammount: Double =0.0

    ammount = transferAmount * commission
    if (ammount<35) println("Комиссия равна 35 руб.") else println("Комиcсия равна: ${String.format("%.2f", ammount)} руб.")
}