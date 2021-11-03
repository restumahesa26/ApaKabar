package com.example.apakabar.ui.message.media

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
import com.example.apakabar.model.dummy.MessageMediaModel
import com.example.apakabar.model.dummy.MessagePesanModel
import com.example.apakabar.ui.detail.DetailActivity
import com.example.apakabar.ui.message.pesan.MessagePesanAdapter
import kotlinx.android.synthetic.main.fragment_message_media.*
import kotlinx.android.synthetic.main.fragment_message_pesan.*

class MessageMediaFragment : Fragment(), MessageMediaAdapter.ItemAdapterCallback {

    private var pesanList : ArrayList<MessageMediaModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message_media, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = MessageMediaAdapter(pesanList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListMedia.layoutManager = layoutManager
        rcListMedia.adapter = adapter
    }

    fun initDataDummy() {
        pesanList = ArrayList()
        pesanList.add(MessageMediaModel("Alfath Arif", "Laporan Basis Data.pdf", "1 hari yang lalu"))
        pesanList.add(MessageMediaModel("Rizky Aruni", "Laporan Dasar Pemrograman.pdf", "2 hari yang lalu"))
        pesanList.add(MessageMediaModel("Danurifa", "Tugas IMK - Kelompok 1", "2 hari yang lalu"))
        pesanList.add(MessageMediaModel("Farel Setyo", "Laporan Multimedia.pdf", "2 hari yang lalu"))
        pesanList.add(MessageMediaModel("Rolin Sanjaya", "Tugas Etika Profesi.pdf", "2 hari yang lalu"))
        pesanList.add(MessageMediaModel("Andrei Jonior", "Tugas Kriptografi.pdf", "3 hari yang lalu"))
        pesanList.add(MessageMediaModel("Wahyu Dwi", "Tugas DAA.pdf", "3 hari yang lalu"))
        pesanList.add(MessageMediaModel("Adde Nanda", "Tugas Anaprancis.pdf", "4 hari yang lalu"))
    }

    override fun onClick(v: View, data: MessageMediaModel) {
        val pesan = Intent(activity, DetailActivity::class.java)
        pesan.putExtra("page_request", 2)
        startActivity(pesan)
    }
}