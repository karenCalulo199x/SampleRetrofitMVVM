package com.example.retrofitmvvm.APIs

import com.example.retrofitmvvm.model.Coffee
import com.example.retrofitmvvm.model.CoffeeItem
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface APIService {

    @GET("/coffee/{type}")
    fun getCoffee(@Path("type") type : String) :
            Observable<CoffeeItem>
}