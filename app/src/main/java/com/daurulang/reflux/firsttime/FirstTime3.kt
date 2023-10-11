package com.daurulang.reflux.firsttime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daurulang.reflux.R
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.databinding.ActivityFirstTime3Binding

class FirstTime3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityFirstTime3Binding = DataBindingUtil.setContentView(this@FirstTime3,
        R.layout.activity_first_time3
        )

        val myView = findViewById<View>(R.id.view3)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        binding.button.setOnClickListener{
            startActivity(Intent(this@FirstTime3, FirstTime4::class.java))
        }

    }
}