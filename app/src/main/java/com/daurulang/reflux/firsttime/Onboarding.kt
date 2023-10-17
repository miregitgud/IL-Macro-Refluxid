package com.daurulang.reflux.firsttime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityOnboardingBinding
import com.daurulang.reflux.halamanlogin.Login
import com.daurulang.reflux.registerscreen.RegisterScreen1

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityOnboardingBinding = DataBindingUtil.setContentView(this@Onboarding,
        R.layout.activity_onboarding
            )

        val myView = findViewById<View>(R.id.onboardingview)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        binding.buttonDaftarSekarang.setOnClickListener{
            startActivity(Intent(this@Onboarding, RegisterScreen1::class.java))
        }
        binding.buttonMasuk.setOnClickListener{
            startActivity(Intent(this@Onboarding, Login::class.java))
        }

    }
}