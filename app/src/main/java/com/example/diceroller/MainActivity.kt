package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bt.setOnClickListener {
            rollDice(binding)
        }
    }

    private fun rollDice(binding: ActivityMainBinding) {
        val randomInt=Random().nextInt(6)+1
        val srcimg=when(randomInt)
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->R.drawable.empty_dice
        }
        binding.diceImage.setImageResource(srcimg)
    }
}