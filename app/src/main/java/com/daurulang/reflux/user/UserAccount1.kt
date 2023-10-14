package com.akun.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityUserAccount1Binding

class UserAccount1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityUserAccount1Binding = DataBindingUtil.setContentView(this@UserAccount1,
            R.layout.activity_user_account1
        )
        setSupportActionBar(binding.actionBar1)
        supportActionBar?.title = "Detail Akun"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

}
