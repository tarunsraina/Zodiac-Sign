package com.tarun.zodiacsign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tarun.zodiacsign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReset.setOnClickListener {
            binding.result.text = null
            binding.monthText.text = null
            binding.dateText.text = null
        }

        binding.btnFind.setOnClickListener {
            val month = binding.monthText.text.toString().toInt()
            val date = binding.dateText.text.toString().toInt()
            val zodiac = when {
                (month == 1 && date >= 20 || month == 2 && date <= 19)
                -> "Aquaris"
                (month == 2 && date >= 20 || month == 3 && date <= 20)
                -> "Pisces"
                (month == 12 && date >= 22 || month == 1 && date <= 19)
                -> "Capricon"
                (month == 11 && date >= 23 || month == 12 && date <= 21)
                -> "Sagittarius"
                (month == 10 && date >= 23 || month == 11 && date <= 22)
                -> "Scorpio"
                (month == 9 && date >= 23 || month == 10 && date <= 22)
                -> "Libra"
                (month == 8 && date >= 23 || month == 9 && date <= 22)
                -> "virgo"
                (month == 7 && date >= 23 || month == 8 && date <= 22)
                -> "Leo"
                (month == 6 && date >= 21 || month == 7 && date <= 22)
                -> "Cancer"
                (month == 5 && date >= 21 || month == 6 && date <= 20)
                -> "Gemini"
                (month == 4 && date >= 21 || month == 5 && date <= 20)
                -> "Taurus"
                (month == 3 && date >= 21 || month == 4 && date <= 20)
                -> "Aries"
                else -> "Invalid input"
            }
            binding.result.text = zodiac
        }
    }
}

