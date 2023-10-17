package com.daurulang.reflux.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityPesananmuBinding
import com.daurulang.reflux.user.fragment.BelumbayarFragment
import com.daurulang.reflux.user.fragment.DikirimFragment
import com.daurulang.reflux.user.fragment.ProsesFragment
import com.daurulang.reflux.user.fragment.SelesaiFragment

class Pesananmu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding : ActivityPesananmuBinding = DataBindingUtil.setContentView(
            this@Pesananmu, R.layout.activity_pesananmu
        )

        setSupportActionBar(binding.actionbar4)
        supportActionBar?.title = "Pesananmu"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val showBelumBayar = intent.getBooleanExtra("SHOW_BELUM_BAYAR", false)
        if (showBelumBayar) {
            val fragment = BelumbayarFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_fragment, fragment)
                .commit()
        }

        binding.tbBelumbayar.setOnClickListener{
                val fragment = BelumbayarFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container_fragment, fragment)
                    .addToBackStack(null)
                    .commit()
        }

        binding.tbProses.setOnClickListener{
                val fragment = ProsesFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container_fragment, fragment)
                    .addToBackStack(null)
                    .commit()
        }

        binding.tbDikirim.setOnClickListener{
                val fragment = DikirimFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container_fragment, fragment)
                    .addToBackStack(null)
                    .commit()
        }

        binding.tbSelesai.setOnClickListener{
            val fragment = SelesaiFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_fragment, fragment)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this@Pesananmu, UserAccount1::class.java)

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
            val intent = Intent(this, UserAccount1::class.java)
            startActivity(intent)
            finish()
        }

}