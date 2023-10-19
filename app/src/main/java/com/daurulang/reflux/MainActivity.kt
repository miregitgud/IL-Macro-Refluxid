package com.daurulang.reflux

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.daurulang.reflux.databinding.ActivityMainBinding
import com.daurulang.reflux.edukasi.Education
import com.daurulang.reflux.halamanproduk.MainHalamanProduk
import com.daurulang.reflux.kirimsampah.KirimSampahMain
import com.daurulang.reflux.navfragments.Akun
import com.daurulang.reflux.navfragments.Home
import com.daurulang.reflux.navfragments.PojokEdukasi
import com.daurulang.reflux.navfragments.Toko
import com.daurulang.reflux.user.UserAccount1
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        setSupportActionBar(binding.actionbar2)
        supportActionBar?.title = ""

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.background = null

        bottomNavigationView.menu.getItem(2).isEnabled = false

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> replaceFragment(Home())
                R.id.toko -> {
                    val intent = Intent(this, MainHalamanProduk::class.java)
                    startActivity(intent)
                }
                R.id.akun -> {
                    val intent = Intent(this, UserAccount1::class.java)
                    startActivity(intent)
                }
                R.id.pojokEdukasi -> {
                    val intent = Intent(this, Education::class.java)
                    intent.putExtra("SHOW_BERITA", true)
                    startActivity(intent)
                }
                else -> {

                }
            }
            true
        }
        binding.fab.setOnClickListener{
            startActivity(Intent(this, KirimSampahMain::class.java))
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
}
