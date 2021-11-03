package com.example.apakabar.ui.message

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apakabar.R
import com.example.apakabar.model.dummy.HomeModel
import com.example.apakabar.model.dummy.MessageKontakModel
import kotlinx.android.synthetic.main.item_home_horizontal.view.*
import kotlinx.android.synthetic.main.item_message_horizontal.view.*

class MessageKontakAdapter (
    private val listData : List<MessageKontakModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<MessageKontakAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageKontakAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_message_horizontal, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: MessageKontakAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : MessageKontakModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvNamaKontak.text = data.nama

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPhoto)

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:MessageKontakModel)
    }
}