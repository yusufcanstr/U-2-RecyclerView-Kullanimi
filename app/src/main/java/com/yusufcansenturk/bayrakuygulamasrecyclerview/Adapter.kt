package com.yusufcansenturk.bayrakuygulamasrecyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yusufcansenturk.bayrakuygulamasrecyclerview.databinding.RecyclerRowBinding

class Adapter(val bayraklarList: ArrayList<bayraklar>) : RecyclerView.Adapter<Adapter.BayraklarHolder>() {

    class BayraklarHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BayraklarHolder {
        //Layout ile bağlama işlemleri yapılır.
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BayraklarHolder(binding)
    }

    override fun onBindViewHolder(holder: BayraklarHolder, position: Int) {
        // Layout'a bağlandıktan sonra ne olacak o yazılır.
        Picasso.get().load(bayraklarList.get(position).image).into(holder.binding.recyclerRowImageView)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetayActivity::class.java)
            intent.putExtra("bayrak", bayraklarList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return bayraklarList.size
    }

}