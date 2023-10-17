package com.daurulang.reflux.registerscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityRegisterScreen2Binding

class RegisterScreen2 : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterScreen2Binding // Declare the binding property

    private val digitFields by lazy {
        arrayOf(
            binding.editTextDigit1,
            binding.editTextDigit2,
            binding.editTextDigit3,
            binding.editTextDigit4
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val myView = findViewById<View>(R.id.view)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        for (i in 0 until digitFields.size) {
            digitFields[i].addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                }

                override fun afterTextChanged(editable: Editable?) {
                    // Check if all digit fields are filled
                    val allDigitsFilled = digitFields.all { it.text.isNotEmpty() }

                    if (allDigitsFilled) {
                        Handler().postDelayed({
                            val intent = Intent(this@RegisterScreen2, RegisterScreen3::class.java)
                            startActivity(intent)
                            finish()
                        }, 3000)
                    }
                }
            })
        }

        // Check after a certain time (e.g., 10 seconds)
        Handler().postDelayed({
            if (!areAllDigitsFilled()) {
                // Show error popup
                showErrorPopup()
            }
        }, 7000)
    }

    private fun areAllDigitsFilled(): Boolean {
        return digitFields.all { it.text.isNotEmpty() }
    }

    private fun showErrorPopup() {
        val toast = Toast.makeText(this, "Kode OTP yang anda masukkan salah!", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
}
