package com.emi.consts.kiss

import java.util.regex.Pattern

object Validator{

    fun isPasswordValid(password : String) : Boolean{
        val pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,}$")
        val matcher = pattern.matcher(password)
        return matcher.matches()
    }

    fun isEmailValid(email : String) : Boolean{
        val pattern = Pattern.compile("^.+@.+\\..+$")
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }

    fun isPhoneNumberValid(number : String) : Boolean{
        val pattern = Pattern.compile("(?<!\\w)(\\(?(\\+|00)?48\\)?)?[ -]?\\d{3}[ -]?\\d{3}[ -]?\\d{3}(?!\\w)")
        val matcher = pattern.matcher(number)
        return matcher.matches()
    }

}