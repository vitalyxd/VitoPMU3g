package com.example.vito3gpmu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vito3gpmu.databinding.ActivitySilaTrenjaBinding

class SilaTrenja : AppCompatActivity() {

    lateinit var binding: ActivitySilaTrenjaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sila_trenja)
        binding = ActivitySilaTrenjaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Izracun.setOnClickListener {

            val ft = binding.FaktorTrenja.text.toString().toFloatOrNull()
            val sila = binding.Sila.text.toString().toFloatOrNull()

            if (ft != null && ft != 0.0f) {
                val st = ft * sila!!
                binding.Rezultat.text = "Rezultat je " + st.toString() + "N"
            } else {
            binding.Rezultat.text ="Unesite valjane brojeve"
            }
        }
    }
}