package com.daurulang.reflux

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daurulang.reflux.databinding.ActivityLoadingScreenBinding

class LoadingScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoadingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.image2.alpha = 0f
        binding.image2.animate().setDuration(1500).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}
