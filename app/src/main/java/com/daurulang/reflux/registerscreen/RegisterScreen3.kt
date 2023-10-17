package com.daurulang.reflux.registerscreen

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityRegisterScreen3Binding
import com.daurulang.reflux.halamanlogin.Login
import com.github.dhaval2404.imagepicker.ImagePicker

class RegisterScreen3 : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterScreen3Binding
    private var imageButton: ImageButton? = null
    private var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register_screen3)

        val myView = findViewById<View>(R.id.view)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        binding.button.setOnClickListener {
            startActivity(Intent(this@RegisterScreen3, Login::class.java))
        }

        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.BLUE))

        // Use safe call operator (?)
        imageView = binding.imagePic
        imageButton = binding.imagePick

        imageView?.setOnClickListener {
            ImagePicker.with(this)
                .crop()
                .compress(1024)
                .maxResultSize(1080, 1080)
                .start()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Use safe call operator (?) here as well
        imageView?.setImageURI(data?.data)
    }
}
