package com.example.apakabar.ui.message.pesan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apakabar.R
import com.example.apakabar.model.dummy.HomeModel
import com.example.apakabar.model.dummy.MessagePesanModel
import com.example.apakabar.ui.detail.DetailActivity
import com.example.apakabar.ui.home.HomeAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_message.*
import kotlinx.android.synthetic.main.fragment_message_pesan.*

class MessagePesanFragment : Fragment(), MessagePesanAdapter.ItemAdapterCallback {

    private var pesanList : ArrayList<MessagePesanModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message_pesan, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = MessagePesanAdapter(pesanList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListPesan.layoutManager = layoutManager
        rcListPesan.adapter = adapter
    }

    fun initDataDummy() {
        pesanList = ArrayList()
        pesanList.add(MessagePesanModel("Alfath Arif", "Apa Kabar?", "1 menit yang lalu"))
        pesanList.add(MessagePesanModel("Rizky Aruni", "Apa Kabar?", "1 menit yang lalu"))
        pesanList.add(MessagePesanModel("Danurifa", "Apa Kabar?", "1 menit yang lalu"))
        pesanList.add(MessagePesanModel("Farel Setyo", "Apa Kabar?", "1 menit yang lalu"))
        pesanList.add(MessagePesanModel("Rolin Sanjaya", "Apa Kabar?", "1 menit yang lalu"))
        pesanList.add(MessagePesanModel("Andrei Jonior", "Apa Kabar?", "1 menit yang lalu"))
        pesanList.add(MessagePesanModel("Wahyu Dwi", "Apa Kabar?", "1 menit yang lalu"))
        pesanList.add(MessagePesanModel("Adde Nanda", "Apa Kabar?", "1 menit yang lalu"))
    }

    override fun onClick(v: View, data: MessagePesanModel) {
        val pesan = Intent(activity, DetailActivity::class.java)
        pesan.putExtra("page_request", 2)
        startActivity(pesan)
    }
}