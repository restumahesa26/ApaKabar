package com.example.apakabar.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apakabar.R
import com.example.apakabar.model.dummy.HomeModel
import com.example.apakabar.model.dummy.HomePostModel
import kotlinx.android.synthetic.main.item_home_horizontal.view.*
import kotlinx.android.synthetic.main.item_home_vertical.view.*

class HomePostAdapter (
    private val listData : List<HomePostModel>,
    private val itemAdapterCallback: HomePostAdapter.ItemAdapterCallback
) : RecyclerView.Adapter<HomePostAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomePostAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_home_vertical, parent, false)
        return HomePostAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: HomePostAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : HomePostModel, itemAdapterCallback: HomePostAdapter.ItemAdapterCallback) {
            itemView.apply {
                tvNama2.text = data.nama
                tvHari.text = data.hari
                tvJudul.text = data.judul
                tvTanggal.text = data.tanggal

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPhoto)

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:HomePostModel)
    }
}