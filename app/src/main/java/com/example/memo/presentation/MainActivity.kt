package com.example.memo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.memo.R
import com.example.memo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startInitialFragment()
    }

    private fun startInitialFragment() {
        supportFragmentManager.beginTransaction()
            .add(binding.fragmentContainer.id, TodoListFragment())
            .commit()
    }
}