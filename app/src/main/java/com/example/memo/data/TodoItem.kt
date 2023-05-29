package com.example.memo.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_items")
data class TodoItem(
    @ColumnInfo(name = "description")
    private var description: String,
    @ColumnInfo(name = "isCompleted")
    private var isCompleted: Int,
    @ColumnInfo(name = "isActive")
    private var isActive: Int,
    @ColumnInfo(name = "title")
    private var title: String,
    @ColumnInfo(name = "location")
    private var location: String?
) {
    @PrimaryKey(autoGenerate = true)
    private var id: Int?= null
}
