package com.janaina.shoppinkotlin.models

class Products {

    var id : Int = 1
    var title : String = ""
    // var price : Double = 0.00
    // var description : String = ""
    // var category : String = ""
    // var image : String = ""
    // var rating : String = ""

    override fun toString(): String {
        return "Post $id: $title:"
    }
}