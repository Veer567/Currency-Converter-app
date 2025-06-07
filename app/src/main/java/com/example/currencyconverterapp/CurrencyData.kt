package com.example.currencyconverterapp

object CurrencyData {
    // Exchange rates relative to USD (as of a hypothetical date, e.g., June 2025)
    val exchangeRates = mapOf(
        "USD" to 1.0,    // US Dollar
        "EUR" to 0.85,   // Euro
        "GBP" to 0.73,   // British Pound
        "INR" to 83.5,   // Indian Rupee
        "JPY" to 150.0,  // Japanese Yen
        "AUD" to 1.35,   // Australian Dollar
        "CAD" to 1.30,   // Canadian Dollar
        "CHF" to 0.90,   // Swiss Franc
        "CNY" to 7.10,   // Chinese Yuan
        "BRL" to 5.50    // Brazilian Real
        // Add more currencies as needed
    )

    // Currency names for better UX
    val currencyNames = mapOf(
        "USD" to "United States Dollar",
        "EUR" to "Euro",
        "GBP" to "British Pound",
        "INR" to "Indian Rupee",
        "JPY" to "Japanese Yen",
        "AUD" to "Australian Dollar",
        "CAD" to "Canadian Dollar",
        "CHF" to "Swiss Franc",
        "CNY" to "Chinese Yuan",
        "BRL" to "Brazilian Real"
    )

    val currencyList = exchangeRates.keys.toList().sorted()
}