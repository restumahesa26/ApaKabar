package com.example.apakabar.ui.detail.kontak

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
import com.example.apakabar.model.dummy.MessageKontakModel
import com.example.apakabar.ui.auth.AuthActivity
import com.example.apakabar.ui.detail.DetailActivity
import com.example.apakabar.ui.message.MessageKontakAdapter
import kotlinx.android.synthetic.main.fragment_kontak.*
import kotlinx.android.synthetic.main.fragment_message.*
import kotlinx.android.synthetic.main.fragment_signin.*

class KontakFragment : Fragment(), DetailKontakAdapter.ItemAdapterCallback {

    private var kontakList : ArrayList<DetailKontakModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kontak, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = DetailKontakAdapter(kontakList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcListDetailKontak.layoutManager = layoutManager
        rcListDetailKontak.adapter = adapter
    }

    fun initDataDummy() {
        kontakList = ArrayList()
        kontakList.add(DetailKontakModel("Rizky Aruni", ""))
        kontakList.add(DetailKontakModel("Alfath Arif Rizkullah", ""))
        kontakList.add(DetailKontakModel("Danurifa Mubarik Imam", ""))
        kontakList.add(DetailKontakModel("Farel Setyo", ""))
        kontakList.add(DetailKontakModel("Robert Junior", ""))
        kontakList.add(DetailKontakModel("Jhony Robertson", ""))
        kontakList.add(DetailKontakModel("Joko Widodo", ""))
        kontakList.add(DetailKontakModel("Susilo Bambang Yudhoyono", ""))
        kontakList.add(DetailKontakModel("Adde Nanda", ""))
        kontakList.add(DetailKontakModel("Rolin Sanjaya Tamba", ""))
        kontakList.add(DetailKontakModel("Andrei Jonior Gustari", ""))
        kontakList.add(DetailKontakModel("Rizki Gusmanto", ""))
        kontakList.add(DetailKontakModel("Ronaldo Junior", ""))
        kontakList.add(DetailKontakModel("Rizky Aruni", ""))
        kontakList.add(DetailKontakModel("Alfath Arif Rizkullah", ""))
        kontakList.add(DetailKontakModel("Danurifa Mubarik Imam", ""))
        kontakList.add(DetailKontakModel("Farel Setyo", ""))
        kontakList.add(DetailKontakModel("Robert Junior", ""))
        kontakList.add(DetailKontakModel("Jhony Robertson", ""))
        kontakList.add(DetailKontakModel("Joko Widodo", ""))
        kontakList.add(DetailKontakModel("Susilo Bambang Yudhoyono", ""))
        kontakList.add(DetailKontakModel("Adde Nanda", ""))
        kontakList.add(DetailKontakModel("Rolin Sanjaya Tamba", ""))
        kontakList.add(DetailKontakModel("Andrei Jonior Gustari", ""))
        kontakList.add(DetailKontakModel("Rizki Gusmanto", ""))
        kontakList.add(DetailKontakModel("Ronaldo Junior", ""))
        kontakList.add(DetailKontakModel("Rizky Aruni", ""))
        kontakList.add(DetailKontakModel("Alfath Arif Rizkullah", ""))
        kontakList.add(DetailKontakModel("Danurifa Mubarik Imam", ""))
        kontakList.add(DetailKontakModel("Farel Setyo", ""))
        kontakList.add(DetailKontakModel("Robert Junior", ""))
        kontakList.add(DetailKontakModel("Jhony Robertson", ""))
        kontakList.add(DetailKontakModel("Joko Widodo", ""))
        kontakList.add(DetailKontakModel("Susilo Bambang Yudhoyono", ""))
        kontakList.add(DetailKontakModel("Adde Nanda", ""))
        kontakList.add(DetailKontakModel("Rolin Sanjaya Tamba", ""))
        kontakList.add(DetailKontakModel("Andrei Jonior Gustari", ""))
        kontakList.add(DetailKontakModel("Rizki Gusmanto", ""))
        kontakList.add(DetailKontakModel("Ronaldo Junior", ""))
    }

    override fun onClick(v: View, data: DetailKontakModel) {
        val pesan = Intent(activity, DetailActivity::class.java)
        pesan.putExtra("page_request", 2)
        startActivity(pesan)
    }
}