package com.emi.consts.dependency_inversion

import androidx.lifecycle.ViewModel

class Downloader(private val network : Network) : ViewModel(), NetworkListener{

    private var restApi = RestNetwork()


    init {
        restApi.setListener(this)
    }


    fun fetch(params : String){
        network.download(params)
    }


    override fun onFetchedResult(data: String) {

    }

    override fun onError(error: Throwable) {

    }

    override fun onCleared() {
        restApi.callback.clear()
        super.onCleared()
    }
}