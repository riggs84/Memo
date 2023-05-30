package com.example.memo.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.memo.R
import com.example.memo.databinding.ActivityMainBinding
import com.example.memo.databinding.FragmentTodoListBinding

class TodoListFragment : Fragment() {

    private lateinit var binding: FragmentTodoListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodoListBinding.inflate(inflater, container, false)
        return binding.root
    }
}