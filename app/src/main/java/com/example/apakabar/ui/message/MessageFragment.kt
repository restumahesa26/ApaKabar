package com.example.apakabar.ui.message

import android.R.attr.fragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apakabar.R
import com.example.apakabar.model.dummy.MessageKontakModel
import com.example.apakabar.ui.detail.DetailActivity
import com.example.apakabar.ui.detail.pesan.DetailPesanFragment
import kotlinx.android.synthetic.main.fragment_message.*


class MessageFragment : Fragment(), MessageKontakAdapter.ItemAdapterCallback {

    private var kontakList : ArrayList<MessageKontakModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_message, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = MessageKontakAdapter(kontakList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rcListKontak.layoutManager = layoutManager
        rcListKontak.adapter = adapter

        val sectionPagerAdapter = SectionPagerAdapter(
            childFragmentManager
        )
        viewPager.adapter = sectionPagerAdapter
        tabLayout.setupWithViewPager(viewPager)

        btnKontak.setOnClickListener {
            val detail = Intent(activity, DetailActivity::class.java)
            startActivity(detail)
        }
    }

    fun initDataDummy() {
        kontakList = ArrayList()
        kontakList.add(MessageKontakModel("Rizky A..", ""))
        kontakList.add(MessageKontakModel("Alfath A..", ""))
        kontakList.add(MessageKontakModel("Danurifa..", ""))
        kontakList.add(MessageKontakModel("Farel S.", ""))
        kontakList.add(MessageKontakModel("Robert J..", ""))
        kontakList.add(MessageKontakModel("Jhony R..", ""))
    }

    override fun onClick(v: View, data: MessageKontakModel) {
        val pesan = Intent(activity, DetailActivity::class.java)
        pesan.putExtra("page_request", 2)
        pesan.putExtra("nama", data.nama)
        startActivity(pesan)
    }
}