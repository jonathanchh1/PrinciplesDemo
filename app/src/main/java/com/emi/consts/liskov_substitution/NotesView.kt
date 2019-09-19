package com.emi.consts.liskov_substitution

import java.io.File

class NotesView {

    val notes = mutableListOf<MediaNote>()

    //you can add your data here and initialize the play and display information based on all the inherited class and logic
    //passed to play
    fun init(){
        notes.add(AudioNote("audio", "description", File("audio.mp3"),"transcription"))
        notes.add(VideoNote("video", "description", File("video.mp3"), "subtitle"))
    }

    fun playNote(index : Int){
        notes.get(index).play()
    }
}