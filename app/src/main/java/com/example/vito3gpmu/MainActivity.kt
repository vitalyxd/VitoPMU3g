package com.example.vito3gpmu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.vito3gpmu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.SilaTrenja.setOnClickListener{

            Intent(this,SilaTrenja::class.java).also { startActivity(it) }
        }

        binding.ElOtpornost.setOnClickListener{

            Intent(this,ElektricnaOtpornost::class.java).also { startActivity(it) }
        }
    }


}

