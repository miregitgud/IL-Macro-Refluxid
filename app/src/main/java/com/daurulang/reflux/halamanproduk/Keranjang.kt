package com.daurulang.reflux.halamanproduk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityKeranjangBinding

class Keranjang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityKeranjangBinding = DataBindingUtil.setContentView(this,R.layout.activity_keranjang)

        setSupportActionBar(binding.actionbarKeranjang)
        supportActionBar?.title = "Keranjang"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnCheckout.setOnClickListener{
            startActivity(Intent(this, KonfirmasiPembelian::class.java))
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}