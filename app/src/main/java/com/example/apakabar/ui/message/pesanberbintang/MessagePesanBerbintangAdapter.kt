package com.example.apakabar.ui.message.pesanberbintang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apakabar.R
import com.example.apakabar.model.dummy.MessageMediaModel
import com.example.apakabar.model.dummy.MessagePesanBerbintangModel
import kotlinx.android.synthetic.main.item_message_media_vertical.view.*

class MessagePesanBerbintangAdapter (
    private val listData : List<MessagePesanBerbintangModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<MessagePesanBerbintangAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagePesanBerbintangAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_message_berbintang_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: MessagePesanBerbintangAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : MessagePesanBerbintangModel, itemAdapterCallback: ItemAdapterCallback) {
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
        fun onClick(v: View, data:MessagePesanBerbintangModel)
    }
}