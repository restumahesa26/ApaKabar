package com.example.apakabar.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.apakabar.R
import kotlinx.android.synthetic.main.fragment_detail_pesan.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val pageRequest = intent.getIntExtra("page_request", 0)
        if (pageRequest == 2) {
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentKontak, true)
                .build()

            Navigation.findNavController(findViewById(R.id.detailHostFragment))
                .navigate(R.id.action_fragment_pesan, null, navOptions)
        }
    }
}