package com.example.apakabar.ui.detail.kontak

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apakabar.R
import com.example.apakabar.model.dummy.DetailKontakModel
import com.example.apakabar.model.dummy.HomeModel
import com.example.apakabar.model.dummy.MessageKontakModel
import kotlinx.android.synthetic.main.item_detail_kontak.view.*

class DetailKontakAdapter (
    private val listData : List<DetailKontakModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<DetailKontakAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailKontakAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_detail_kontak, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: DetailKontakAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : DetailKontakModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvNama.text = data.nama

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPhoto)

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:DetailKontakModel)
    }
}