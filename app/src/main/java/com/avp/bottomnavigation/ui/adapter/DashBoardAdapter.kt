package com.avp.bottomnavigation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.avp.bottomnavigation.R
import com.avp.bottomnavigation.models.ItemDashBoardModel
import kotlinx.android.synthetic.main.item_dash_board.view.*

class DashBoardAdapter(
    val itemDashBoardModels: List<ItemDashBoardModel>
) : RecyclerView.Adapter<DashBoardAdapter.ChatViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val chatViewHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_dash_board,parent, false)
        return ChatViewHolder(chatViewHolder)
    }

    override fun getItemCount(): Int {
        return itemDashBoardModels.size
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.itemView.tvUserName.text = itemDashBoardModels[position].userName
        holder.itemView.tvDescription.text = itemDashBoardModels[position].description
    }

    class ChatViewHolder(item: View) : RecyclerView.ViewHolder(item)

}