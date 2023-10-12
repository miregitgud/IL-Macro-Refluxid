package com.daurulang.reflux.registerscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityRegisterScreen1Binding

class RegisterScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityRegisterScreen1Binding = DataBindingUtil.setContentView(this@RegisterScreen1,
            R.layout.activity_register_screen1
        )

        val myView = findViewById<View>(R.id.view)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        binding.button.setOnClickListener{
            startActivity(Intent(this@RegisterScreen1, RegisterScreen2::class.java))
        }
    }
}