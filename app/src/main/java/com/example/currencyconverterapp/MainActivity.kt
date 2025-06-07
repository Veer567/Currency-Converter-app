package com.example.currencyconverterapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var amountInputLayout: TextInputLayout
    private lateinit var amountEditText: TextInputEditText
    private lateinit var sourceCurrencySpinner: Spinner
    private lateinit var targetCurrencySpinner: Spinner
    private lateinit var swapButton: MaterialButton
    private lateinit var convertButton: MaterialButton
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        amountInputLayout = findViewById(R.id.amountInputLayout)
        amountEditText = findViewById(R.id.amountEditText)
        sourceCurrencySpinner = findViewById(R.id.sourceCurrencySpinner)
        targetCurrencySpinner = findViewById(R.id.targetCurrencySpinner)
        swapButton = findViewById(R.id.swapButton)
        convertButton = findViewById(R.id.convertButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up spinners with currency names
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            CurrencyData.currencyList.map { "${it} - ${CurrencyData.currencyNames[it]}" }
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sourceCurrencySpinner.adapter = adapter
        targetCurrencySpinner.adapter = adapter

        // Swap button logic
        swapButton.setOnClickListener {
            val sourcePos = sourceCurrencySpinner.selectedItemPosition
            val targetPos = targetCurrencySpinner.selectedItemPosition
            sourceCurrencySpinner.setSelection(targetPos)
            targetCurrencySpinner.setSelection(sourcePos)
        }

        // Convert button logic
        convertButton.setOnClickListener {
            val amountStr = amountEditText.text.toString()
            if (amountStr.isEmpty()) {
                amountInputLayout.error = "Please enter an amount"
                return@setOnClickListener
            }

            val amount = amountStr.toDoubleOrNull()
            if (amount == null) {
                amountInputLayout.error = "Invalid amount"
                return@setOnClickListener
            } else {
                amountInputLayout.error = null
            }

            val sourceCurrency = CurrencyData.currencyList[sourceCurrencySpinner.selectedItemPosition]
            val targetCurrency = CurrencyData.currencyList[targetCurrencySpinner.selectedItemPosition]

            if (sourceCurrency == targetCurrency) {
                resultTextView.text = String.format("Result: %.2f %s", amount, targetCurrency)
                return@setOnClickListener
            }

            // Perform conversion
            val sourceRate = CurrencyData.exchangeRates[sourceCurrency] ?: 1.0
            val targetRate = CurrencyData.exchangeRates[targetCurrency] ?: 1.0
            val convertedAmount = amount * (targetRate / sourceRate)
            resultTextView.text = String.format("Result: %.2f %s", convertedAmount, targetCurrency)
        }
    }
}