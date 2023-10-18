package com.daurulang.reflux.registerscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import androidx.databinding.DataBindingUtil
import banksampah
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityRegisterScreen4Binding
import toko

class RegisterScreen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val binding : ActivityRegisterScreen4Binding = DataBindingUtil.setContentView(this@RegisterScreen4,
            R.layout.activity_register_screen4
        )

        val toko = toko()
        fragmentTransaction.replace(R.id.container, toko)
        fragmentTransaction.commit()

        val radioButtonA: RadioButton = findViewById(R.id.rb_umkm)
        val radioButtonB: RadioButton = findViewById(R.id.rb_pengelola)

        radioButtonA.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val fragmentTransaction = fragmentManager.beginTransaction()
                val toko = toko()
                fragmentTransaction.replace(R.id.container, toko)
                fragmentTransaction.commit()
            }
        }

        radioButtonB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val fragmentTransaction = fragmentManager.beginTransaction()
                val banksampah = banksampah()
                fragmentTransaction.replace(R.id.container, banksampah)
                fragmentTransaction.commit()
            }
        }

    }

}