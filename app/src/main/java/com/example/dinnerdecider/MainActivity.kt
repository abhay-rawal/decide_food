package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dinnerdecider.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var food = arrayListOf<String>("Hamburger", "Pizza","Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addFood.setOnClickListener()
        {
            food.add(binding.addFoodText.text.toString())
            binding.addFoodText.text.clear()
        }
        binding.decide.setOnClickListener()
        {

            binding.SelectedFood.text = food.random()

        }
    }
}