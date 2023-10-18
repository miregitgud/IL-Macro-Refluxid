package com.daurulang.reflux.registerscreen.halamanlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daurulang.reflux.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val myView = findViewById<View>(R.id.viewlogin)
        myView.setBackgroundResource(R.drawable.gradient_drawable)
    }
}