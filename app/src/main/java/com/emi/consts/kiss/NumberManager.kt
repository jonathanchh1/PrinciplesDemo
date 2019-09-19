package com.emi.consts.kiss

class NumberManager(private var number : Int){

    companion object{
        const val ONE_HUNDRED = 100
    }

    fun multiplyNumber(value : Int){
        number*= value
    }
}