package com.emi.consts.kiss

class DateUtils {

    //DON't REPEAT YOURSELF SAMPLE

   companion object{
       const val MILLISECONDS_IN_HOUR = 1000 * 60 * 60 * 24
   }

    fun getMillisecondInDay(millisecond : Long) : Long{
        return millisecond/ MILLISECONDS_IN_HOUR
    }

    fun getDaysInMilliSeconds(days : Long) : Long{
        return days * MILLISECONDS_IN_HOUR
    }

}