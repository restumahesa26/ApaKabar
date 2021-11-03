package com.example.apakabar.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apakabar.R
import com.example.apakabar.model.dummy.HomeModel
import com.example.apakabar.model.dummy.HomePostModel
import com.example.apakabar.ui.MainActivity
import com.example.apakabar.ui.detail.CeritaActivity
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), HomeAdapter.ItemAdapterCallback, HomePostAdapter.ItemAdapterCallback {

    private var accountList : ArrayList<HomeModel> = ArrayList()
    private var postList : ArrayList<HomePostModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = HomeAdapter(accountList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rcListAccount.layoutManager = layoutManager
        rcListAccount.adapter = adapter

        initDataDummy2()
        var adapter2 = HomePostAdapter(postList, this)
        var layoutManager2: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListPost.layoutManager = layoutManager2
        rcListPost.adapter = adapter2
    }

    fun initDataDummy() {
        accountList = ArrayList()
        accountList.add(HomeModel("Mufti Restu", ""))
        accountList.add(HomeModel("Rizky Aruni", ""))
        accountList.add(HomeModel("Alfath Arif", ""))
        accountList.add(HomeModel("Danurifa", ""))
        accountList.add(HomeModel("Farel Setyo", ""))
    }

    fun initDataDummy2() {
        postList = ArrayList()
        postList.add(HomePostModel("Rizky Aruni", "1 hari yang lalu", "Makanan 4 Sehat 5 Sempurna", "Diposting 10 Oktober 2021, Pukul 15.00"))
        postList.add(HomePostModel("Alfath Arif", "2 hari yang lalu", "Makanan Cocok Untuk Mahasiswa", "Diposting 9 Oktober 2021, Pukul 9.00"))
        postList.add(HomePostModel("Danurifa", "2 hari yang lalu", "Makanan Ramah Dikantong", "Diposting 9 Oktober 2021, Pukul 11.00"))
        postList.add(HomePostModel("Farel Setyo", "2 hari yang lalu", "Manfaat Minum Air Putih", "Diposting 9 Oktober 2021, Pukul 14.00"))
    }

    override fun onClick(v: View, data: HomeModel) {
        val cerita = Intent(activity, CeritaActivity::class.java)
        startActivity(cerita)
    }

    override fun onClick(v: View, data: HomePostModel) {
        Toast.makeText(context, "Anda Mengklik " + data.judul, Toast.LENGTH_SHORT).show()
    }
}