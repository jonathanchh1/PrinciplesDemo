package com.emi.consts.dry

import java.util.*

//names explain the purpose of the class keep all logic that implements the same
//business logic in one place /DON'T REPEAT YOURSELF...
object DateObject{


    const val MILLISECONDS_IN_HOURS : Long = 1000 * 60 * 60

    fun isPast(timestamp : Long) : Boolean{
        return timestamp < System.currentTimeMillis()
    }

    fun isPast(date : Date) : Boolean{
        return date.time < System.currentTimeMillis()
    }

    fun getFullDays(timestamp: Long) : Long{
        return timestamp / MILLISECONDS_IN_HOURS
    }

    fun getFullDays(date : Date) : Long{
        return date.time / MILLISECONDS_IN_HOURS
    }
}