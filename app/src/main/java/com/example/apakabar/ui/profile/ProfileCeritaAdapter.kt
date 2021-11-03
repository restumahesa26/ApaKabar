package com.example.apakabar.ui.profile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apakabar.R
import com.example.apakabar.model.dummy.MessagePesanModel
import com.example.apakabar.model.dummy.ProfileCeritaModel
import kotlinx.android.synthetic.main.item_message_vertical.view.*
import kotlinx.android.synthetic.main.item_profile_vertical.view.*

class ProfileCeritaAdapter (
    private val listData : List<ProfileCeritaModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<ProfileCeritaAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileCeritaAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_profile_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ProfileCeritaAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : ProfileCeritaModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvCerita.text = data.pesan
                tvHari.text = data.waktu
                tvLike.text = data.like.toString()
                tvKomentar.text = data.komentar.toString()
                tvShare.text = data.share.toString()

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPhoto)

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:ProfileCeritaModel)
    }
}