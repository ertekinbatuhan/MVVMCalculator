package com.batuhanberkertekin.mvvmcalculator

import androidx.lifecycle.MutableLiveData

class CalculatorRepository {

    var RepoResult = MutableLiveData<String>()

    init {
        RepoResult = MutableLiveData<String>("")

    }

    fun getCalculator() : MutableLiveData<String>{
        return RepoResult
    }


    fun toplama(deger : String , deger1 : String){
        val result = deger.toInt() + deger1.toInt()


        RepoResult.value = result.toString()


    }

    fun carpma(deger : String , deger1 : String){

        val result = deger.toInt() * deger1.toInt()

        RepoResult.value = result.toString()
    }

    fun cikarma(deger : String , deger1 : String){
        val result = deger.toInt() - deger1.toInt()

        RepoResult.value = result.toString()
    }


    fun bolme(deger : String , deger1 : String){
        val result = deger.toInt() / deger1.toInt()
        RepoResult.value = result.toString()
    }
}