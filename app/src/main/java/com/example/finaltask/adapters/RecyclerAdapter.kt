package com.example.finaltask.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finaltask.R
import com.example.finaltask.databinding.CardListitemBinding
import com.example.finaltask.models.ProductModel

class RecyclerAdapter(mList:ArrayList<ProductModel>):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private lateinit var binding: CardListitemBinding
    private var list = mList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = CardListitemBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.productName.text = list[position].name
        holder.productName.inputType = list[position].price
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){


        var productName:TextView = itemView.findViewById(R.id.productName)
        var productPrice:TextView = itemView.findViewById(R.id.productPrice)

    }
}