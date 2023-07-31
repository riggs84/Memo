package com.example.memo.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.memo.data.TodoItem
import com.example.memo.databinding.FragmentAddTodoBinding

class AddTodoFragment : Fragment() {

    private lateinit var binding: FragmentAddTodoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddTodoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.saveTaskBtn.setOnClickListener {
            onAddBtnClick()
        }
    }

    private fun onAddBtnClick() {
        val title = binding.titleInput.text.toString()
        val description = binding.descriptionInput.text.toString()
        var newItem = TodoItem(description = description, title = title)
    }
}