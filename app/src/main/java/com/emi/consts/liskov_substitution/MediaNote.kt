package com.emi.consts.liskov_substitution

import java.io.File

open class MediaNote(title : String, desc : String, val file : File) : Note(title, desc){

    //some media variables

    open fun play(){
        //read file and prepare media playback and play
    }
}