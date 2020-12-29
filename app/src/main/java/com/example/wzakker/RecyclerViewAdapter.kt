package com.example.wzakker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.wzakker.Model.Model
import kotlinx.android.synthetic.main.itemview.view.*

class RecyclerViewAdapter(private val items :List<Model>,private val onItemClickListener: OnItemClickListener) :RecyclerView.Adapter<AzkarViewHolder>( ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AzkarViewHolder {
       return AzkarViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false))
    }
    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: AzkarViewHolder, position: Int) {
       val zekr = items[position]
        holder.itemView.setOnClickListener{
            onItemClickListener.onItemClick(position)
        }
    }

}