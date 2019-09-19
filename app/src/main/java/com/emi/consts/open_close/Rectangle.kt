package com.emi.consts.open_close

class Rectangle(val a : Double, val b : Double): Figure(){

    override fun getArea(): Double {
        return a * b
    }

    override fun getCircumference(): Double {
        return 2 * a + 2 * b
    }

}