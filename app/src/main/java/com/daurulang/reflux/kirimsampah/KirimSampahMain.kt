package com.daurulang.reflux.kirimsampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.MainActivity
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityKirimSampahMainBinding

class KirimSampahMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityKirimSampahMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_kirim_sampah_main)

        setSupportActionBar(binding.actionBarKirimSampah)
        supportActionBar?.title = "Pengiriman Sampah"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnKirimSampah.setOnClickListener{
            startActivity(Intent(this, KonfirmasiPengiriman::class.java))
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, MainActivity::class.java)

        when (item.itemId) {
            android.R.id.home -> {
                startActivity(intent)
                return true
            }
            else -> {
                startActivity(intent)
                return true
            }
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}