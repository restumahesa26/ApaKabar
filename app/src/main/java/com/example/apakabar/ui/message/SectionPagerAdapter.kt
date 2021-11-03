package com.example.apakabar.ui.message

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.apakabar.ui.message.arsip.MessageArsipFragment
import com.example.apakabar.ui.message.media.MessageMediaFragment
import com.example.apakabar.ui.message.pesan.MessagePesanFragment
import com.example.apakabar.ui.message.pesanberbintang.MessagePesanBerbintangFragment

class SectionPagerAdapter (fm:FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Pesan"
            1 -> "Media"
            2 -> "Pesan Berbintang"
            3 -> "Arsip"
            else -> ""
        }
    }

    override fun getItem(position: Int): Fragment {
        var fragment : Fragment
        return when(position) {
            0 -> {
                fragment = MessagePesanFragment()
                return fragment
            }
            1 -> {
                fragment = MessageMediaFragment()
                return fragment
            }
            2 -> {
                fragment = MessagePesanBerbintangFragment()
                return fragment
            }
            3 -> {
                fragment = MessageArsipFragment()
                return fragment
            }
            else -> {
                fragment = MessagePesanFragment()
                return fragment
            }
        }

    }

    override fun getCount(): Int {
        return 4
    }
}