package com.example.retrofitmvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitmvvm.R
import com.example.retrofitmvvm.model.Coffee
import com.example.retrofitmvvm.model.CoffeeItem
import kotlinx.android.synthetic.main.list_item.view.*

class CoffeeListAdapter : RecyclerView.Adapter<CoffeeListAdapter.MyViewHolder>() {

    val coffeeListData = ArrayList<CoffeeItem>()


    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        val tvTitle = v.title
        val tvDesc = v.desc
        val tvIngredients = v.ing

        fun bind(data: Coffee) {
            tvTitle.text = data.

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(coffeeListData[position])
    }

    override fun getItemCount(): Int {
        return coffeeListData.size
    }

}