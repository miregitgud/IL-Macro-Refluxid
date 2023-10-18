package com.daurulang.reflux.halamanproduk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityMainHalamanProdukBinding

class MainHalamanProduk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainHalamanProdukBinding = DataBindingUtil.setContentView(this,
        R.layout.activity_main_halaman_produk
        )

        setSupportActionBar(binding.actionbarHalamanProduk)
        supportActionBar?.title = "Halaman Produk"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnTambahkeKeranjang.setOnClickListener{
            startActivity(Intent(this@MainHalamanProduk, Keranjang::class.java))
        }
        binding.btnBeliSekarang.setOnClickListener{
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