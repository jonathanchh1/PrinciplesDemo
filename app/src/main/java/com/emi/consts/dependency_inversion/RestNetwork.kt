package com.emi.consts.dependency_inversion

import java.lang.ref.WeakReference

class RestNetwork : Network{

    private lateinit var listener : NetworkListener
    val  callback = WeakReference<NetworkListener>(listener)
    override fun download(params: String) {
        callback.get()!!.onFetchedResult(params)
        //create some rest client and fetch data
        //call endpoint method
        //set callback for response

    }

    fun setListener(listener: NetworkListener){
        this.listener = listener
    }

}