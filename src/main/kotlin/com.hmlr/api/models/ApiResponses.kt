package com.hmlr.api.models

import net.corda.core.contracts.Amount
import net.corda.core.contracts.LinearState
import net.corda.core.identity.Party
import java.math.BigDecimal
import java.math.RoundingMode
import java.security.PublicKey
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.util.*

fun Party.toSimpleName(): String {
    return "${name.organisation} (${name.locality}, ${name.country})"
}

data class StateAndInstant<out T : LinearState> constructor(val state: T, val instant: Instant?) {
    //Below is a sneaky way of, when creating a new StateAndInstance, returning null if the state parameter is null.
    //The below invoke operator function will be called if the state is nullable, whereas the constructor will be called if it is not.
    //To call this function use the same syntax as calling the constructor and the compiler will work out which one to use depending on if the state is nullable.
    companion object {
        operator fun <T : LinearState> invoke(state: T?, instant: Instant?) : StateAndInstant<T>? {
            state ?: return null
            return StateAndInstant(state, instant)
        }
    }
}

fun getAmount(quantity: BigDecimal, currencyCode: String): Amount<Currency> {
    return Amount.fromDecimal(quantity, Currency.getInstance(currencyCode), RoundingMode.FLOOR)
}

@JvmName("getAmountNullable")
fun getAmount(quantity: BigDecimal?, currencyCode: String?): Amount<Currency>? {
    quantity ?: return null
    currencyCode ?: return null

    return getAmount(quantity, currencyCode)
}
