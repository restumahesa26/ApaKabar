package com.example.apakabar.ui.detail.pesan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apakabar.R
import com.example.apakabar.model.dummy.DetailKontakModel
import com.example.apakabar.model.dummy.DetailPesanModel
import com.example.apakabar.ui.detail.DetailActivity
import com.example.apakabar.ui.detail.kontak.DetailKontakAdapter
import kotlinx.android.synthetic.main.fragment_detail_pesan.*
import kotlinx.android.synthetic.main.fragment_kontak.*

class DetailPesanFragment : Fragment(), DetailPesanAdapter.ItemAdapterCallback {

    private var pesanList : ArrayList<DetailPesanModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_pesan, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = DetailPesanAdapter(pesanList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListDetailPesan.layoutManager = layoutManager
        rcListDetailPesan.adapter = adapter
    }

    fun initDataDummy() {
        pesanList = ArrayList()
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
        pesanList.add(DetailPesanModel("Halo", "Hai"))
    }

    override fun onClick(v: View, data: DetailPesanModel) {
        TODO("Not yet implemented")
    }
}