package com.example.listviewprojectk

import androidx.annotation.DrawableRes

class Product {
    private var name: String
        get() {return this.name}
        set(value) {this.name=value}
    private var costOfProducts: Int
        get() {
            return (costOfProducts)
        }
        set(value) {this.costOfProducts=value}
    @get:DrawableRes
    private var photoId: Int
    get() {return photoId}
    set(value) {this.photoId=value}
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