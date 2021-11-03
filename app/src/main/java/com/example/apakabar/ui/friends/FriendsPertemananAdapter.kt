package com.example.apakabar.ui.friends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apakabar.R
import com.example.apakabar.model.dummy.FriendsPertemananModel
import com.example.apakabar.model.dummy.HomeModel
import kotlinx.android.synthetic.main.item_friends_vertical.view.*
import kotlinx.android.synthetic.main.item_home_horizontal.view.*
import kotlinx.android.synthetic.main.item_home_horizontal.view.tvNama

class FriendsPertemananAdapter (
    private val listData : List<FriendsPertemananModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<FriendsPertemananAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsPertemananAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_friends_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: FriendsPertemananAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : FriendsPertemananModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvNama.text = data.nama

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPhoto)

                btnTerimaPertemanan.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:FriendsPertemananModel)
    }
}