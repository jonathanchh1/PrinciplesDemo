package com.emi.consts.open_close

import kotlin.math.pow

class Circle(val a : Double, val r : Double) : Figure() {

    override fun getArea(): Double {
        return Math.PI * a * r.pow(2.0)
    }

    override fun getCircumference(): Double {
        return 2 * Math.PI * r
    }

}