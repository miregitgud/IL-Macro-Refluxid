package com.daurulang.reflux.registerscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityRegisterScreen3Binding
import com.daurulang.reflux.halamanlogin.Login

class RegisterScreen3 : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterScreen3Binding // Declare the binding variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register_screen3)

        val myView = findViewById<View>(R.id.view)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        binding.button.setOnClickListener {
            startActivity(Intent(this@RegisterScreen3, Login::class.java))
        }
    }
}
