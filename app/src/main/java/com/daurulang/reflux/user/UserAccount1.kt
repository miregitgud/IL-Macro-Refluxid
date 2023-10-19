package com.daurulang.reflux.user
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomsheet.BottomSheetDialog
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.MainActivity
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityUserAccount1Binding
import com.daurulang.reflux.halamanlogin.Login

class UserAccount1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityUserAccount1Binding = DataBindingUtil.setContentView(this@UserAccount1,
            R.layout.activity_user_account1
        )
        setSupportActionBar(binding.actionBar1)
        supportActionBar?.title = "Detail Akun"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnInformasiAkun.setOnClickListener{
            showAccountInformation()
        }

        binding.btnPengaturanAplikasi.setOnClickListener{
            startActivity(Intent(this@UserAccount1, AppSettings::class.java))
        }

        binding.btnFavoritmu.setOnClickListener{
            startActivity(Intent(this@UserAccount1, Favoritmu::class.java))
        }

        binding.btnPesananmu.setOnClickListener{
            val intent = Intent(this@UserAccount1, Pesananmu::class.java)
            intent.putExtra("SHOW_BELUM_BAYAR", true)
            startActivity(intent)
        }

        binding.btnTokomu.setOnClickListener{
            popUp()
        }

        binding.btnLogOut.setOnClickListener{
            startActivity(Intent(this, Login::class.java))
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    private fun showAccountInformation(){
        val bottomSheetDialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.activity_edit_account, null)
        bottomSheetDialog.setContentView(view)
        bottomSheetDialog.show()
    }

    fun popUp(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Ooops!!")
        builder.setMessage("Anda Belum Membuat Toko")

        builder.setPositiveButton("Nanti Saja") {dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, MainActivity::class.java)

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
