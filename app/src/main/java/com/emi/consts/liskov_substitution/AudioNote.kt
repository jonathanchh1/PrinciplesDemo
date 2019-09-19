package com.emi.consts.liskov_substitution

import java.io.File

 open class AudioNote(title : String, desc : String, file : File, val transcription : String) : MediaNote(title, desc, file){


     //you can add accounts here for audionotes that can be played at notesView
     override fun play() {
         super.play()
     }

}