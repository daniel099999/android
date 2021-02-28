package com.avp.bottomnavigation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.avp.bottomnavigation.R
import com.avp.bottomnavigation.models.ItemHomeModel
import kotlinx.android.synthetic.main.item_home.view.*

class HomeAdapter(
    val itemHomeModels: List<ItemHomeModel>
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val homeViewHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return HomeViewHolder(homeViewHolder)
    }

    override fun getItemCount(): Int {
        return itemHomeModels.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.itemView.tvAuthor.text = itemHomeModels[position].author
        holder.itemView.tvContent.text = itemHomeModels[position].content
    }

    class HomeViewHolder(item: View) : RecyclerView.ViewHolder(item) {

    }
}