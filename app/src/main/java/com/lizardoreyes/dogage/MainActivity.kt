package com.lizardoreyes.dogage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lizardoreyes.dogage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            val myAge = binding.edtAge.text.toString()

            if (myAge.isNotEmpty()) {
                val myAgeDog = myAge.toInt() * 10
                binding.tvMessage.text = getString(R.string.message, myAgeDog)
            } else {
                binding.tvMessage.text = getString(R.string.no_message)
            }

        }
    }
}