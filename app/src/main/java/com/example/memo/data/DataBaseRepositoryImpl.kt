package com.example.memo.data

import com.example.memo.data.database.ToDoItemDatabase

class DataBaseRepositoryImpl(private val db: ToDoItemDatabase): IDataBaseRepository {

    override suspend fun insertItem(item: TodoItem) = db.getDataBase().insertItem(item)

    override suspend fun updateItem(item: TodoItem) = db.getDataBase().updateItem(item)

    override fun getItems() = db.getDataBase().getAllItems()
}