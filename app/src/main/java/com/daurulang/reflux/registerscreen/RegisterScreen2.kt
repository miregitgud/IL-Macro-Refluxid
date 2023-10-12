package com.daurulang.reflux.registerscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.daurulang.reflux.R
import com.daurulang.reflux.databinding.ActivityRegisterScreen2Binding
import com.daurulang.reflux.registerscreen.RegisterScreen2
class RegisterScreen2 : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterScreen2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Assuming you have EditText fields named editTextDigit1 to editTextDigit4
        val digitFields = arrayOf(
            binding.editTextDigit1,
            binding.editTextDigit2,
            binding.editTextDigit3,
            binding.editTextDigit4
        )
        val myView = findViewById<View>(R.id.view)
        myView.setBackgroundResource(R.drawable.gradient_drawable)

        // Listen for changes in each digit field
        for (i in 0 until digitFields.size) {
            digitFields[i].addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {
                    // Not needed in this case
                }

                override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                    // Not needed in this case
                }

                override fun afterTextChanged(editable: Editable?) {
                    // Check if all digit fields are filled
                    val allDigitsFilled = digitFields.all { it.text.isNotEmpty() }

                    if (allDigitsFilled) {
                        // All digit fields are filled, start the delay and switch to RegisterScreen3
                        Handler().postDelayed({
                            val intent = Intent(this@RegisterScreen2, RegisterScreen3::class.java)
                            startActivity(intent)
                            finish() // Optional: finish the current activity
                        }, 3000) // 3000 milliseconds (3 seconds) delay
                    }
                }
            })
        }
    }

}