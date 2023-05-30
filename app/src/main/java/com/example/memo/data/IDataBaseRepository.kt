package com.example.memo.data

interface IDataBaseRepository {

    suspend fun insertItem(item: TodoItem)

    suspend fun updateItem(item: TodoItem)

    fun getItems(): List<TodoItem>
}