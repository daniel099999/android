package com.avp.bottomnavigation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.avp.bottomnavigation.R
import com.avp.bottomnavigation.models.ItemNotificationModel
import kotlinx.android.synthetic.main.item_notification.view.*

class NotificationAdapter(
    val itemNotificationModels: List<ItemNotificationModel>
) : RecyclerView.Adapter<NotificationAdapter.ProfileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val profileViewHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_notification,parent,false)
        return ProfileViewHolder(profileViewHolder)
    }

    override fun getItemCount(): Int {
        return itemNotificationModels.size
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.itemView.tvUserName.text = itemNotificationModels[position].userName
        holder.itemView.tvGender.text = itemNotificationModels[position].gender
        holder.itemView.tvBirthday.text = itemNotificationModels[position].birthday
    }

    class ProfileViewHolder(item: View) : RecyclerView.ViewHolder(item)
}