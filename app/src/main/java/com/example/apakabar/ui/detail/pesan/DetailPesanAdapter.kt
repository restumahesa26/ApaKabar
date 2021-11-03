package com.example.apakabar.ui.detail.pesan

import android.content.Intent.getIntent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apakabar.R
import com.example.apakabar.model.dummy.DetailKontakModel
import com.example.apakabar.model.dummy.DetailPesanModel
import com.example.apakabar.model.dummy.HomeModel
import com.example.apakabar.model.dummy.MessageKontakModel
import kotlinx.android.synthetic.main.item_detail_kontak.view.*
import kotlinx.android.synthetic.main.item_detail_pesan_vertical.view.*

class DetailPesanAdapter (
    private val listData : List<DetailPesanModel>,
    private val itemAdapterCallback : ItemAdapterCallback
) : RecyclerView.Adapter<DetailPesanAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailPesanAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_detail_pesan_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: DetailPesanAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : DetailPesanModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvPesanPengirim.text = data.pesan1
                tvPesanPenerima.text = data.pesan2

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPhoto)

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:DetailPesanModel)
    }
}