package com.example.apakabar.ui.profile

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
import com.example.apakabar.model.dummy.HomeModel
import com.example.apakabar.model.dummy.ProfileCeritaModel
import com.example.apakabar.ui.home.HomeAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_message.*

class ProfileFragment : Fragment(), ProfileCeritaAdapter.ItemAdapterCallback {

    private var ceritaList : ArrayList<ProfileCeritaModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_profile, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = ProfileCeritaAdapter(ceritaList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListKontak.layoutManager = layoutManager
        rcListKontak.adapter = adapter
    }

    fun initDataDummy() {
        ceritaList = ArrayList()
        ceritaList.add(ProfileCeritaModel("Aku telah mengambil gambar ini di pagi hari. Bagaimana menurut kalian ?", "Hari ini 8.00 am", 450, 27, 124))
        ceritaList.add(ProfileCeritaModel("Aku telah mengambil gambar ini di pagi hari. Bagaimana menurut kalian ?", "Hari ini 8.00 am", 450, 27, 124))
        ceritaList.add(ProfileCeritaModel("Aku telah mengambil gambar ini di pagi hari. Bagaimana menurut kalian ?", "Hari ini 8.00 am", 450, 27, 124))
        ceritaList.add(ProfileCeritaModel("Aku telah mengambil gambar ini di pagi hari. Bagaimana menurut kalian ?", "Hari ini 8.00 am", 450, 27, 124))
        ceritaList.add(ProfileCeritaModel("Aku telah mengambil gambar ini di pagi hari. Bagaimana menurut kalian ?", "Hari ini 8.00 am", 450, 27, 124))
        ceritaList.add(ProfileCeritaModel("Aku telah mengambil gambar ini di pagi hari. Bagaimana menurut kalian ?", "Hari ini 8.00 am", 450, 27, 124))
    }

    override fun onClick(v: View, data: ProfileCeritaModel) {
        Toast.makeText(context, "Anda Mengklik " + data.pesan, Toast.LENGTH_SHORT).show()
    }
}