package com.example.apakabar.ui.message.media

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apakabar.R
import com.example.apakabar.model.dummy.MessageMediaModel
import kotlinx.android.synthetic.main.item_message_media_vertical.view.*

class MessageMediaAdapter (
    private val listData : List<MessageMediaModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<MessageMediaAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageMediaAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_message_media_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: MessageMediaAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : MessageMediaModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvNamaMessage.text = data.nama
                tvPesanMessage.text = data.pesan
                tvWaktuMessage.text = data.waktu

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPhoto)

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:MessageMediaModel)
    }
}