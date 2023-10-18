package com.daurulang.reflux.registerscreen.halamanlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.LoadingScreenActivity
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this@Login,
            R.layout.activity_login
        )

        val myView = findViewById<View>(R.id.viewlogin)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        binding.button.setOnClickListener{
            startActivity(Intent(this@Login, LoadingScreenActivity::class.java))
        }
    }
}