package com.example.retrofitmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitmvvm.R
import com.example.retrofitmvvm.viewmodel.CoffeeViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel : CoffeeViewModel
    lateinit var coffeeListAdapter : CoffeeListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerView.apply {
            val layoutManager = LinearLayoutManager(context)
            val deco = DividerItemDecoration(applicationContext, VERTICAL)
            addItemDecoration(deco)

            adapter = coffeeListAdapter
        }
    }

    fun loadAPIData() {
        viewModel =
    }
}