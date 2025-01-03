package com.gabrieldev.androidmaster.IMCcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.gabrieldev.androidmaster.IMCcalculator.IMCcalculatorActivity.Companion.IMC_Key
import com.gabrieldev.androidmaster.R



class ResultImcActivity : AppCompatActivity() {

    private lateinit var tvResultFormula: TextView
    private lateinit var tvIMC:TextView
    private lateinit var  tvDescription:TextView
    private lateinit var  btnRecalculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)
        val result: Double = intent.extras?.getDouble(IMC_Key) ?:-1.0
        initcomponents()
        initUI(result)
        initListeners()
        }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed()}
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when(result){
            in 0.00..18.50 ->{//bajo peso

                tvResultFormula.text = getString(R.string.title_low_weight)
                tvResultFormula.setTextColor(ContextCompat.getColor(this, R.color.low_high_weight))
                tvDescription.text = getString(R.string.description_low_weight)
                }
            in 18.51..24.99 ->{//normal

                tvResultFormula.text = getString(R.string.title_normal_weight)
                tvResultFormula.setTextColor(ContextCompat.getColor(this, R.color.normal_weight))
                tvDescription.text = getString(R.string.description_normal_weight)
            }
            in 25.00..29.99 ->{//mucho peso

                tvResultFormula.text = getString(R.string.title_high_weight)
                tvResultFormula.setTextColor(ContextCompat.getColor(this, R.color.low_high_weight))
                tvDescription.text = getString(R.string.description_high_weight)
            }
            in 30.00..99.00 ->{//obesidad

                tvResultFormula.text = getString(R.string.title_obesity_weight)
                tvResultFormula.setTextColor(ContextCompat.getColor(this, R.color.obesity))
                tvDescription.text = getString(R.string.description_obesity_weight)
            }
            else->{//error
                tvIMC.text = getString(R.string.error)
                tvResultFormula.setTextColor(ContextCompat.getColor(this, R.color.obesity))

                tvResultFormula.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }


    }

    private fun initcomponents() {
        tvResultFormula = findViewById(R.id.tvResultFormula)
        tvDescription = findViewById(R.id.tvDescription)
        tvIMC = findViewById(R.id.tvIMC)
        btnRecalculate = findViewById(R.id.btnReCalculate)
    }
}