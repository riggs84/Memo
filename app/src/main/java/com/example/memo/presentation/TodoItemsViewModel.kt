package com.example.memo.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.memo.data.IDataBaseRepository
import com.example.memo.data.TodoItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class TodoItemsViewModel(private val repository: IDataBaseRepository): ViewModel() {

    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    private var _items = MutableLiveData<List<TodoItem>>()
    var todoItems: LiveData<List<TodoItem>> = _items

    init {
        updateLiveDataItems()
    }

    fun insertItem(item: TodoItem) = coroutineScope.launch {
        repository.insertItem(item)
        updateLiveDataItems()
    }

    fun updateItem(item: TodoItem) = coroutineScope.launch {
        repository.updateItem(item)
        updateLiveDataItems()
    }

    private fun updateLiveDataItems() {
        _items.value = repository.getItems()
    }
}