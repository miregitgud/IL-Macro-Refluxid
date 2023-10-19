package com.daurulang.reflux.navfragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.daurulang.reflux.edukasi.Education
import com.daurulang.reflux.halamanproduk.Keranjang
import com.daurulang.reflux.user.Favoritmu
import androidx.fragment.app.Fragment
import com.daurulang.reflux.databinding.FragmentHomeBinding
import com.daurulang.reflux.halamanproduk.MainHalamanProduk

class Home : Fragment() {

    // Declare view binding variable
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout using view binding
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cartbutton.setOnClickListener {
            val intent = Intent(requireActivity(), Keranjang::class.java)
            startActivity(intent)
        }
        binding.favoritebutton.setOnClickListener {
            val intent = Intent(requireActivity(), Favoritmu::class.java)
            startActivity(intent)
        }

        binding.newsbutton.setOnClickListener {
            val intent = Intent(requireActivity(), Education::class.java)
            intent.putExtra("SHOW_BERITA", true)
            startActivity(intent)
        }

        binding.laporanKontribusi.setOnClickListener {
            val intent = Intent(requireActivity(), MainHalamanProduk::class.java)
            startActivity(intent)
        }
    }
}
