package com.example.scratchcardsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.scratchcardsample.databinding.ActivityMainBinding
import com.gpfreetech.views.ScratchImageView

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
    }

    fun setupListeners(){
        binding.scratchView.setRevealListener(object :ScratchImageView.IRevealListener{
            override fun onRevealed(iv: ScratchImageView?) {
                Toast.makeText(this@MainActivity,"woaahhaa you have won money wallet!!",Toast.LENGTH_SHORT).show()
            }

            override fun onRevealPercentChangedListener(siv: ScratchImageView?, percent: Float) {

            }
        })
    }
}