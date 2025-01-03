package com.gabrieldev.androidmaster.IMCcalculator

import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.gabrieldev.androidmaster.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider

class IMCcalculatorActivity : AppCompatActivity() {
    private var isMaleSelected:Boolean =true
    private var isFemaleSelected:Boolean =false
    private var currentWeight:Int = 40
    private var currentAge: Int = 18
    private var currentHeight:Int = 120


    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var tvHeight:TextView
    private lateinit var rsHeight:RangeSlider
    private lateinit var tvPeso:TextView
    private lateinit var tvEdad:TextView
    private lateinit var btnSubstractWeight:FloatingActionButton
    private lateinit var btnPlusWeight:FloatingActionButton
    private lateinit var btnSubstractAge:FloatingActionButton
    private lateinit var btnPlusAge:FloatingActionButton
    private lateinit var btnCalculate:Button


    companion object{
        const val IMC_Key = "IMC_Result"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_imccalculator)
        initComponent()
        initListener()
        initUI()

        }

    private fun initComponent(){
        viewMale = findViewById<CardView>(R.id.cvMale)
        viewFemale = findViewById<CardView>(R.id.cvFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        tvPeso = findViewById(R.id.tvPeso)
        tvEdad = findViewById(R.id.tvEdad)
        btnSubstractWeight = findViewById(R.id.btnSubstractWeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        btnPlusAge = findViewById(R.id.btnPlusAge)
        btnSubstractAge = findViewById(R.id.btnSubstractAge)
        btnCalculate = findViewById(R.id.btnCalculate)


        }
    private fun initListener(){
        viewMale.setOnClickListener{
            setGenderColor()
            changeGender()
        }
        viewFemale.setOnClickListener{
            setGenderColor()
            changeGender()
        }
        rsHeight.addOnChangeListener { _, value, _ ->
        val df = DecimalFormat ("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "$currentHeight CM"
        }
        btnPlusWeight.setOnClickListener{
            currentWeight +=1
            setWeight()
        }
        btnSubstractWeight.setOnClickListener{
            currentWeight -=1
            setWeight()
        }
        btnPlusAge.setOnClickListener{
            currentAge +=1
            setAge()
        }
        btnSubstractAge.setOnClickListener{
            currentAge -=1
            setAge()
        }
        btnCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateTo(result)
        }
    }

    private fun navigateTo(result: Double) {
        val intent = Intent(this , ResultImcActivity::class.java )
        intent.putExtra(IMC_Key, result)
        startActivity(intent)
    }

    private fun calculateIMC(): Double {
        val df = DecimalFormat("#.##")

        val imc = currentWeight / (currentHeight.toDouble()/100 * currentHeight.toDouble()/100)
        return df.format(imc).toDouble()
    }

    private fun setAge() {
        tvEdad.text = currentAge.toString()    }

    private fun setWeight() {
        tvPeso.text = currentWeight.toString()
    }

    private fun changeGender() {
    isMaleSelected=!isMaleSelected
        isFemaleSelected=!isFemaleSelected

    }
    private fun setGenderColor() {
        viewMale.setBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setBackgroundColor(getBackgroundColor(isFemaleSelected))
        }
    private fun getBackgroundColor(isComponentSelected:Boolean):Int{


        val colorReference = if (isComponentSelected){
             R.color.background_component_selected

        }else
            R.color.background_component

      return  ContextCompat.getColor(this, colorReference)

    }
    private fun initUI() {
        setGenderColor()
        setWeight()
        setAge()
    }
    }
