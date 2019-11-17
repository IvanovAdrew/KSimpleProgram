package com.example.listviewprojectk

import androidx.annotation.DrawableRes

class Product(var name: String,var costOfProducts: Int,@get:DrawableRes var photoId: Int) {
    private var quantity: Int
        get()= quantity
        set(value){this.quantity=value}
    private var costOfAllInEach: Int
        get()= costOfAllInEach
        set(value){this.costOfAllInEach=value}
    companion object{
        private var costOfaLL: Int
            get()= costOfaLL
            set(value){this.costOfaLL=value}
    }


}