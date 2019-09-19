package com.emi.consts.liskov_substitution

 class TextNote(title : String, description : String, val text : String) : Note(title, description){


     override fun someData() {
         super.someData()
     }
}
