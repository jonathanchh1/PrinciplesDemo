package com.emi.consts.single_responsibility

import java.util.regex.Pattern

data class ContactDetails(val email : String, val phoneNumber : String){

    fun isEmailValid() : Boolean{
        val pattern = Pattern.compile("^.+@.+\\..+$")
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }

    fun isPhoneNumberValid() : Boolean{
        val pattern = Pattern.compile("^([+][0-9]{2}) *[0-9]{9}\$")
        val matcher = pattern.matcher(phoneNumber)
        return matcher.matches()
    }
}