package com.example.retrofitmvvm.model


import com.google.gson.annotations.SerializedName

data class CoffeeItem(
    val title: String,
    val description: String,
    val ingredients: List<String>,
    val id: Int
)