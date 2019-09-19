package com.emi.consts.kiss

import com.emi.consts.kiss.Validator
import org.jetbrains.annotations.TestOnly


class ValidatorTest {

    @TestOnly
    fun checkValidPassWords(){
        assert(Validator.isPasswordValid("Abcde0"))
        assert(Validator.isPasswordValid("1234Ab"))
        assert(Validator.isPasswordValid("Abc d0"))
    }

    @TestOnly
    fun checkEmptyPassword(){
        assert(Validator.isPasswordValid(""))
    }

    @TestOnly
    fun checktoShortPassword(){
        assert(Validator.isPasswordValid("Abcd0"))
    }

    @TestOnly
    fun checkOnlySmallLettersPassword(){
        assert(Validator.isPasswordValid("abcdef"))
    }

    @TestOnly
    fun checkOnlyBigLettersPassword(){
        assert(Validator.isPasswordValid("ABCDEF"))
    }

    @TestOnly
    fun checkOnlyNumbersPassword(){
        assert(Validator.isPasswordValid("123456"))
    }
}