val totalOrderPrice = 1_000
val itemPrice = 1000
val numberOfPurchases = 3

fun main() {
    val cumulativeDiscount =
        if (totalOrderPrice in 0..1_000) 0 else if (totalOrderPrice in 1_001..10_000) 100 else itemPrice * 0.005

    val personalDiscount =
        if (numberOfPurchases >= 2) itemPrice * 0.001 else 0

    val totalPrice = itemPrice - cumulativeDiscount.toInt() - personalDiscount.toInt()
    println("Total Price: $totalPrice \u20BD")
}