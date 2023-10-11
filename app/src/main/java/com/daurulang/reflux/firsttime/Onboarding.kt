package com.daurulang.reflux.firsttime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityOnboardingBinding

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityOnboardingBinding = DataBindingUtil.setContentView(this@Onboarding,
        R.layout.activity_onboarding
            )

        val myView = findViewById<View>(R.id.onboardingview)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

    }
}