package com.daurulang.reflux.firsttime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daurulang.reflux.R
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.databinding.ActivityFirstTime2Binding

class FirstTime2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityFirstTime2Binding = DataBindingUtil.setContentView(this@FirstTime2,
            R.layout.activity_first_time2
        )

        val myView = findViewById<View>(R.id.view2)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        binding.button.setOnClickListener{
            startActivity(Intent(this@FirstTime2, FirstTime3::class.java))
        }
    }
}