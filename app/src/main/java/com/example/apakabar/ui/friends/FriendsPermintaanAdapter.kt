package com.example.apakabar.ui.friends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apakabar.R
import com.example.apakabar.model.dummy.FriendsPermintaanModel
import com.example.apakabar.model.dummy.FriendsPertemananModel
import com.example.apakabar.model.dummy.HomeModel
import kotlinx.android.synthetic.main.item_friends_pesan_vertical.view.*
import kotlinx.android.synthetic.main.item_home_horizontal.view.*

class FriendsPermintaanAdapter (
    private val listData : List<FriendsPermintaanModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<FriendsPermintaanAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsPermintaanAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_friends_pesan_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: FriendsPermintaanAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : FriendsPermintaanModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvNamaMessage.text = data.nama
                tvPesanMessage.text = data.pesan

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPhoto)

                btnTerimaPesan.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:FriendsPermintaanModel)
    }
}