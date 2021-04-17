package com.farras.kalenderkeuangan.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farras.kalenderkeuangan.KantorActivity
import com.farras.kalenderkeuangan.PribadiActivity
import com.farras.kalenderkeuangan.R
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.elevation = 0f
        btn_pribadi.setOnClickListener {
            val intent = Intent(this, PribadiActivity::class.java)
            startActivity(intent)
        }

        btn_kantoran.setOnClickListener {
            val intent = Intent(this, KantorActivity::class.java)
            startActivity(intent)
        }
    }
}