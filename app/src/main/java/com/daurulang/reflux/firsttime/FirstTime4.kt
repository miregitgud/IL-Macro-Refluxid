package com.daurulang.reflux.firsttime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityFirstTime4Binding

class FirstTime4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityFirstTime4Binding = DataBindingUtil.setContentView(this@FirstTime4,
        R.layout.activity_first_time4
            )

        val myView = findViewById<View>(R.id.view4)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        binding.button.setOnClickListener{
            startActivity(Intent(this@FirstTime4, Onboarding::class.java))
        }
    }

}