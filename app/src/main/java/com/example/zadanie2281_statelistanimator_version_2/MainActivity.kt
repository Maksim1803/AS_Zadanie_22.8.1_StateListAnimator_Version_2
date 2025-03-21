package com.example.zadanie2281_statelistanimator_version_2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.zadanie2281_statelistanimator_version_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener {
            addButton() // Добавляем кнопку
        }

        binding.buttonRemove.setOnClickListener {
            removeButton() // Удаляем кнопку
        }
    }
    private fun addButton() {
        val button = Button(this)
        button.text = "Button"
        binding.container.addView(button)
    }

    private fun removeButton() {
        if (binding.container.childCount > 0) {
            binding.container.removeViewAt(binding.container.childCount - 1)
        }
    }
}