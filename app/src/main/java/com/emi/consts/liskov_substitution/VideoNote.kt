package com.emi.consts.liskov_substitution

import java.io.File

 open class VideoNote(title : String, desc : String, file : File, val subtitle : String) : MediaNote(title, desc, file){


     override fun play() {
         super.play()
     }

}