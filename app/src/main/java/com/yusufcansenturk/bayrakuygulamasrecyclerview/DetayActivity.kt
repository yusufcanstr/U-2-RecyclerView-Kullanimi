package com.yusufcansenturk.bayrakuygulamasrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusufcansenturk.bayrakuygulamasrecyclerview.databinding.ActivityDetayBinding
import com.yusufcansenturk.bayrakuygulamasrecyclerview.databinding.ActivityMainBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        //casting
        val selectedBayrak = intent.getSerializableExtra("bayrak") as bayraklar

        binding.detayActivityImageView.setImageResource(selectedBayrak.image)
        binding.detayActivityUlkeBaskenti.text = selectedBayrak.baskent
        binding.detayActivityUlkeIsmi.text = selectedBayrak.ulke



    }
}