package com.example.apakabar.ui.message.arsip

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
import com.example.apakabar.model.dummy.MessageArsipModel
import com.example.apakabar.model.dummy.MessagePesanModel
import com.example.apakabar.ui.detail.DetailActivity
import com.example.apakabar.ui.message.pesan.MessagePesanAdapter
import kotlinx.android.synthetic.main.fragment_message_arsip.*
import kotlinx.android.synthetic.main.fragment_message_pesan.*

class MessageArsipFragment : Fragment(), MessageArsipAdapter.ItemAdapterCallback {

    private var pesanList : ArrayList<MessageArsipModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message_arsip, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = MessageArsipAdapter(pesanList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListArsip.layoutManager = layoutManager
        rcListArsip.adapter = adapter
    }

    fun initDataDummy() {
        pesanList = ArrayList()
        pesanList.add(MessageArsipModel("Alfath Arif", "Apa Kabar?"))
        pesanList.add(MessageArsipModel("Rizky Aruni", "Apa Kabar?"))
        pesanList.add(MessageArsipModel("Danurifa", "Apa Kabar?"))
        pesanList.add(MessageArsipModel("Farel Setyo", "Apa Kabar?"))
        pesanList.add(MessageArsipModel("Rolin Sanjaya", "Apa Kabar?"))
        pesanList.add(MessageArsipModel("Andrei Jonior", "Apa Kabar?"))
        pesanList.add(MessageArsipModel("Wahyu Dwi", "Apa Kabar?"))
        pesanList.add(MessageArsipModel("Adde Nanda", "Apa Kabar?"))
    }

    override fun onClick(v: View, data: MessageArsipModel) {
        val pesan = Intent(activity, DetailActivity::class.java)
        pesan.putExtra("page_request", 2)
        startActivity(pesan)
    }
}