package com.example.apakabar.ui.message.pesanberbintang

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
import com.example.apakabar.model.dummy.MessagePesanBerbintangModel
import com.example.apakabar.model.dummy.MessagePesanModel
import com.example.apakabar.ui.detail.DetailActivity
import com.example.apakabar.ui.message.pesan.MessagePesanAdapter
import kotlinx.android.synthetic.main.fragment_message_pesan.*
import kotlinx.android.synthetic.main.fragment_message_pesan_berbintang.*

class MessagePesanBerbintangFragment : Fragment(), MessagePesanBerbintangAdapter.ItemAdapterCallback {

    private var pesanList : ArrayList<MessagePesanBerbintangModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message_pesan_berbintang, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = MessagePesanBerbintangAdapter(pesanList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListPesanBerbintang.layoutManager = layoutManager
        rcListPesanBerbintang.adapter = adapter
    }

    fun initDataDummy() {
        pesanList = ArrayList()
        pesanList.add(MessagePesanBerbintangModel("Alfath Arif", "Selamat Pagi", "1 menit yang lalu"))
        pesanList.add(MessagePesanBerbintangModel("Rizky Aruni", "Selamat Pagi", "1 menit yang lalu"))
        pesanList.add(MessagePesanBerbintangModel("Danurifa", "Selamat Pagi", "1 menit yang lalu"))
        pesanList.add(MessagePesanBerbintangModel("Farel Setyo", "Selamat Pagi", "1 menit yang lalu"))
        pesanList.add(MessagePesanBerbintangModel("Rolin Sanjaya", "Selamat Pagi", "1 menit yang lalu"))
        pesanList.add(MessagePesanBerbintangModel("Andrei Jonior", "Selamat Pagi", "1 menit yang lalu"))
        pesanList.add(MessagePesanBerbintangModel("Wahyu Dwi", "Selamat Pagi", "1 menit yang lalu"))
        pesanList.add(MessagePesanBerbintangModel("Adde Nanda", "Selamat Pagi", "1 menit yang lalu"))
    }

    override fun onClick(v: View, data: MessagePesanBerbintangModel) {
        val pesan = Intent(activity, DetailActivity::class.java)
        pesan.putExtra("page_request", 2)
        startActivity(pesan)
    }
}