package com.example.retrofitmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.retrofitmvvm.APIs.APIInstance
import com.example.retrofitmvvm.APIs.APIService
import com.example.retrofitmvvm.model.Coffee
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class CoffeeViewModel {

    lateinit var coffeeList : MutableLiveData<Coffee>

    init {
        coffeeList = MutableLiveData()
    }

    fun getCoffeeListObserver() : MutableLiveData<Coffee> {
        return coffeeList
    }

    fun makeAPICall(type : String){

        val retrofitInstance = APIInstance.getRetrofit().create(APIService::class.java)
        retrofitInstance.getCoffee(type)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe()
    }

    private fun getCoffeeListObserverRx() : Observer<Coffee> {
        return object : Observer<Coffee> {
            override fun onSubscribe(d: Disposable) {
                TODO("Not yet implemented")
            }

            override fun onNext(t: Coffee) {
                coffeeList.postValue(t)
            }

            override fun onError(e: Throwable) {
                coffeeList.postValue(null)
            }

            override fun onComplete() {
                TODO("Not yet implemented")
            }

        }
    }
}