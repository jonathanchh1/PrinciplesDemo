package com.emi.consts.dependency_inversion

interface NetworkListener{

    fun onFetchedResult(data : String)
    fun onError(error : Throwable)
}