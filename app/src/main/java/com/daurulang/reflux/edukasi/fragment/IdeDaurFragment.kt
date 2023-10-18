package com.daurulang.reflux.edukasi.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.daurulang.reflux.R
import com.daurulang.reflux.edukasi.TempatPensil

class IdeDaurFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.education_idedaur, container, false)

        val btnTempatPensil = view.findViewById<ImageButton>(R.id.btnImage_idedaur_1)
        btnTempatPensil.setOnClickListener {
            val intent = Intent(activity, TempatPensil::class.java)
            activity?.startActivity(intent)
        }
        return view
    }
}