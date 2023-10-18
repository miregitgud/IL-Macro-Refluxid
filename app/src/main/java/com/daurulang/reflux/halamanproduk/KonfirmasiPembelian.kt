package com.daurulang.reflux.halamanproduk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityKonfirmasiPembelianBinding

class KonfirmasiPembelian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityKonfirmasiPembelianBinding = DataBindingUtil.setContentView(this, R.layout.activity_konfirmasi_pembelian)

        setSupportActionBar(binding.actionbarKonfirmasiPembelian)
        supportActionBar?.title = "Konfirmasi Pembelian"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnKonfirmasiPembelian.setOnClickListener{
            popUp()
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    fun popUp(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Sukses!")
        builder.setMessage("Pesanan anda akan segera diproses")

        builder.setPositiveButton("Kembali") {dialog, _ ->
            dialog.dismiss()
            val intent = Intent(this, MainHalamanProduk::class.java)
            startActivity(intent)
        }
        val dialog = builder.create()
        dialog.show()
    }
}