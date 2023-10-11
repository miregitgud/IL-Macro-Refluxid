package com.daurulang.reflux.firsttime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityFirstTime1Binding

class FirstTime1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityFirstTime1Binding = DataBindingUtil.setContentView(this@FirstTime1,
            R.layout.activity_first_time1
        )

        val myView = findViewById<View>(R.id.view)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        binding.button.setOnClickListener{
            startActivity(Intent(this@FirstTime1, FirstTime2::class.java))
        }
    }
}