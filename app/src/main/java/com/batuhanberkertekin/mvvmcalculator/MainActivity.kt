package com.batuhanberkertekin.mvvmcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.batuhanberkertekin.mvvmcalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val  viewModel : CalculatorViewModel by viewModels()
    private lateinit var design : ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      design = DataBindingUtil.setContentView(this,R.layout.activity_main)
        design.calculatorObject = this






          viewModel.sonuc.observe(this,{
               design.calculatorResult = it
          })


    }

    fun toplamaButton(deger : String ,deger1 : String){
         viewModel.toplama(deger,deger1)




    }

    fun carpmaButton(deger : String , deger1 : String){
        viewModel.carpma(deger,deger1)




    }

    fun cikarmaButton(deger : String , deger1 : String){
        viewModel.cikarma(deger,deger1)
    }

    fun bolmeButton(deger: String ,deger1: String){
        viewModel.bolme(deger,deger1)
    }
}