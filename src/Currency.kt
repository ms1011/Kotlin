sealed class Currency {
    abstract val amount: Double
}

data class USD(override val amount: Double) : Currency()
data class KRW(override val amount: Double) : Currency()

fun convert(currency: Currency, rate: Double): Currency {
    return when (currency) {
        is USD -> KRW(currency.amount * rate)
        is KRW -> USD(currency.amount * rate)
    }
}