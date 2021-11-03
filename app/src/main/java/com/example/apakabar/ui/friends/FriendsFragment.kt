package com.example.apakabar.ui.friends

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apakabar.R
import com.example.apakabar.model.dummy.FriendsPermintaanModel
import com.example.apakabar.model.dummy.FriendsPertemananModel
import com.example.apakabar.model.dummy.HomeModel
import com.example.apakabar.ui.detail.DetailActivity
import com.example.apakabar.ui.home.HomeAdapter
import kotlinx.android.synthetic.main.fragment_friends.*
import kotlinx.android.synthetic.main.fragment_home.*

class FriendsFragment : Fragment(), FriendsPertemananAdapter.ItemAdapterCallback, FriendsPermintaanAdapter.ItemAdapterCallback {

    private var pertemananList : ArrayList<FriendsPertemananModel> = ArrayList()
    private var permintaanList : ArrayList<FriendsPermintaanModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_friends, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = FriendsPertemananAdapter(pertemananList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListPertemanan.layoutManager = layoutManager
        rcListPertemanan.adapter = adapter

        initDataDummy2()
        var adapter2 = FriendsPermintaanAdapter(permintaanList, this)
        var layoutManager2: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListPermintaanPesan.layoutManager = layoutManager2
        rcListPermintaanPesan.adapter = adapter2
    }

    fun initDataDummy() {
        pertemananList = ArrayList()
        pertemananList.add(FriendsPertemananModel("Rizky Aruni"))
        pertemananList.add(FriendsPertemananModel("Alfath Arif"))
        pertemananList.add(FriendsPertemananModel("Danurifa"))
        pertemananList.add(FriendsPertemananModel("Farel Setyo"))
        pertemananList.add(FriendsPertemananModel("Jhony Setyo"))
        pertemananList.add(FriendsPertemananModel("Joko Widodo"))
        pertemananList.add(FriendsPertemananModel("Rolin Sanjaya"))
        pertemananList.add(FriendsPertemananModel("Adde Nanda"))
        pertemananList.add(FriendsPertemananModel("Murfid Aqil"))
        pertemananList.add(FriendsPertemananModel("Budi Susilo"))
    }

    fun initDataDummy2() {
        permintaanList = ArrayList()
        permintaanList.add(FriendsPermintaanModel("Rizky Aruni", "Apa Kabar?"))
        permintaanList.add(FriendsPermintaanModel("Alfath Arif", "Apa Kabar?"))
        permintaanList.add(FriendsPermintaanModel("Danurifa", "Apa Kabar?"))
        permintaanList.add(FriendsPermintaanModel("Farel Setyo", "Apa Kabar?"))
        permintaanList.add(FriendsPermintaanModel("Jhony Setyo", "Apa Kabar?"))
        permintaanList.add(FriendsPermintaanModel("Joko Widodo", "Apa Kabar?"))
        permintaanList.add(FriendsPermintaanModel("Rolin Sanjaya", "Apa Kabar?"))
        permintaanList.add(FriendsPermintaanModel("Adde Nanda", "Apa Kabar?"))
        permintaanList.add(FriendsPermintaanModel("Murfid Aqil", "Apa Kabar?"))
        permintaanList.add(FriendsPermintaanModel("Budi Susilo", "Apa Kabar?"))
    }

    override fun onClick(v: View, data: FriendsPermintaanModel) {
        val pesan = Intent(activity, DetailActivity::class.java)
        pesan.putExtra("page_request", 2)
        startActivity(pesan)
    }

    override fun onClick(v: View, data: FriendsPertemananModel) {
        val pesan = Intent(activity, DetailActivity::class.java)
        pesan.putExtra("page_request", 2)
        startActivity(pesan)
    }
}