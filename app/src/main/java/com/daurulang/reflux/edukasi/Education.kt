package com.daurulang.reflux.edukasi


import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.daurulang.reflux.MainActivity
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityEducationBinding
import com.daurulang.reflux.edukasi.fragment.BeritaFragment
import com.daurulang.reflux.edukasi.fragment.ForumFragment
import com.daurulang.reflux.edukasi.fragment.IdeDaurFragment
import com.daurulang.reflux.user.UserAccount1
import com.daurulang.reflux.user.fragment.BelumbayarFragment


class Education : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityEducationBinding = DataBindingUtil.setContentView(this@Education,
            R.layout.activity_education
            )

        setSupportActionBar(binding.actionbar4)
        supportActionBar?.title = "Pojok Edukasi"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val showBerita = intent.getBooleanExtra("SHOW_BERITA", true)

        if (showBerita) {
            val beritaFragment1 = BeritaFragment()
            val beritaFragment2 = BeritaFragment()
            binding.containerFragmentEducation.visibility = View.VISIBLE
            binding.containerFragmentEducation2.visibility = View.VISIBLE
            binding.containerFragmentEducation3.visibility = View.GONE
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_fragment_education, beritaFragment1)
                .addToBackStack(null)
                .commit()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_fragment_education2, beritaFragment2)
                .addToBackStack(null)
                .commit()
        }

        fun changeFragment (fragment: Fragment, fragment2: Fragment){
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_fragment_education, fragment)
                .addToBackStack(null)
                .commit()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_fragment_education2, fragment2)
                .addToBackStack(null)
                .commit()

        }
        binding.rbBerita.isChecked = true
        val beritaFragment1 = BeritaFragment()
        val beritaFragment2 = BeritaFragment()
        changeFragment(beritaFragment1, beritaFragment2)
        binding.rbBerita.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked){
                binding.rbBerita.setTextColor(Color.WHITE)
                val beritaFragment1 = BeritaFragment()
                val beritaFragment2 = BeritaFragment()
                binding.containerFragmentEducation.visibility = View.VISIBLE
                binding.containerFragmentEducation2.visibility = View.VISIBLE
                binding.containerFragmentEducation3.visibility = View.GONE
                changeFragment(beritaFragment1, beritaFragment2)
            }else{
                binding.rbBerita.setTextColor(Color.BLACK)
            }
        }

        binding.rbForum.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked){
                binding.rbForum.setTextColor(Color.WHITE)
                val forumFragment1 = ForumFragment()
                val forumFragment2 = ForumFragment()
                binding.containerFragmentEducation.visibility = View.VISIBLE
                binding.containerFragmentEducation2.visibility = View.VISIBLE
                binding.containerFragmentEducation3.visibility = View.GONE
                changeFragment(forumFragment1, forumFragment2)
            }else{
                binding.rbForum.setTextColor(Color.BLACK)
            }
        }

        binding.rbIdeDaur.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.rbIdeDaur.setTextColor(Color.WHITE)
                val idedaurFragment = IdeDaurFragment()

                binding.containerFragmentEducation.visibility = View.GONE
                binding.containerFragmentEducation2.visibility = View.GONE
                binding.containerFragmentEducation3.visibility = View.VISIBLE

                supportFragmentManager.beginTransaction()
                    .replace(R.id.container_fragment_education4, idedaurFragment)
                    .addToBackStack(null)
                    .commit()
            } else {
                binding.rbIdeDaur.setTextColor(Color.BLACK)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this@Education, MainActivity::class.java)

        when (item.itemId) {
            android.R.id.home -> {
                startActivity(intent)
                return true
            }
            else -> {
                startActivity(intent)
                return true
            }
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}