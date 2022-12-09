package com.batuhanberkertekin.mvvmcalculator

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel()  {

    var sonuc = MutableLiveData<String>()
    var repo = CalculatorRepository()

    init {
        sonuc = repo.RepoResult

    }


    fun toplama(deger : String , deger1 : String){
        repo.toplama(deger,deger1)




    }

    fun carpma(deger : String , deger1 : String){
         repo.carpma(deger,deger1)


    }

    fun cikarma(deger : String , deger1 : String){
        repo.cikarma(deger,deger1)
    }
    fun bolme(deger : String , deger1 : String){
        repo.bolme(deger,deger1)
    }
}