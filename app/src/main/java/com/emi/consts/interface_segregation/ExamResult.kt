package com.emi.consts.interface_segregation
class ExamResult : PrintableDocuments, PrintableSheet{

//each class needs to inherit what their need and not what they don't.
    override fun printDocuments() {

    }

    override fun printSheets() {

    }
}