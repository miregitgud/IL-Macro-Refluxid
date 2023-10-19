package com.daurulang.reflux.kirimsampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.MainActivity
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityKonfirmasiPengirimanBinding

class KonfirmasiPengiriman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityKonfirmasiPengirimanBinding = DataBindingUtil.setContentView(this, R.layout.activity_konfirmasi_pengiriman)

        binding.btnKonfirmasiPengiriman.setOnClickListener{
            popUp()
        }
        setSupportActionBar(binding.actionBarKonfirmasiPengiriman)
        supportActionBar?.title = "Konfirmasi Pengiriman"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    fun popUp(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Sukses!")
        builder.setMessage("Pengiriman sedang dalam proses!")

        builder.setPositiveButton("Kembali") {dialog, _ ->
            dialog.dismiss()
            val intent = Intent(this, KirimSampahMain::class.java)
            startActivity(intent)
        }
        val dialog = builder.create()
        dialog.show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, KirimSampahMain::class.java)

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
        val intent = Intent(this, KirimSampahMain::class.java)
        startActivity(intent)
        finish()
    }
}