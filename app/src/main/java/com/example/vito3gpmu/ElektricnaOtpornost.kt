package com.example.vito3gpmu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Float3
import com.example.vito3gpmu.databinding.ActivityElektricnaOtpornostBinding
import com.example.vito3gpmu.databinding.ActivitySilaTrenjaBinding

class ElektricnaOtpornost : AppCompatActivity() {
    lateinit var binding: ActivityElektricnaOtpornostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elektricna_otpornost)
        binding = ActivityElektricnaOtpornostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Izracun.setOnClickListener {

            val ro = binding.Otpornost.text.toString().toFloatOrNull()
            val l  = binding.Duljina.text.toString().toFloatOrNull()
            val s = binding.PovrsinaPoprecnogPresjeka.text.toString().toFloatOrNull()

            if (ro != null && ro > 0.0f && l != null && l > 0.0f && s != null && s > 0.0f) {
                val elo = ro*(l/s)
                binding.Rezultat.text = "Rezultat je " + elo.toString() + "Ω"
            } else {
                binding.Rezultat.text ="Unesite valjane brojeve!"
            }
        }
    }
}