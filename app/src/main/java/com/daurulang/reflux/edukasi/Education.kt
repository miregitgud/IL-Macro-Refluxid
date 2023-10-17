package com.daurulang.reflux.edukasi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityEducationBinding

class Education : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityEducationBinding = DataBindingUtil.setContentView(this@Education,
            R.layout.activity_education
            )

        setSupportActionBar(binding.actionbar4)
        supportActionBar?.title = "Pojok Edukasi"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.rbBerita.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked){
                binding.rbBerita.setTextColor(Color.WHITE)
            }else{
                binding.rbBerita.setTextColor(Color.BLACK)
            }
        }

        binding.rbForum.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked){
                binding.rbForum.setTextColor(Color.WHITE)
            }else{
                binding.rbForum.setTextColor(Color.BLACK)
            }
        }

        binding.rbIdeDaur.setOnCheckedChangeListener{_, isChecked ->
            if (isChecked){
                binding.rbIdeDaur.setTextColor(Color.WHITE)
            }else{
                binding.rbIdeDaur.setTextColor(Color.BLACK)
            }

        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


}