package com.daurulang.reflux.user
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomsheet.BottomSheetDialog
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityUserAccount1Binding

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
}
