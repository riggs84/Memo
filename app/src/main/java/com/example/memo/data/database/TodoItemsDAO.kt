package com.example.memo.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.memo.data.TodoItem

@Dao
interface TodoItemsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: TodoItem)

    @Update
    suspend fun updateItem(item: TodoItem)

    @Query("SELECT * from todo_items where isActive = 1")
    fun getAllItems(): List<TodoItem>
}