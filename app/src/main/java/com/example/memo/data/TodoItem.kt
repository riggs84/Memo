package com.example.memo.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_items")
data class TodoItem(
    @ColumnInfo(name = "description")
    var description: String?,
    @ColumnInfo(name = "isCompleted")
    var isCompleted: Int = 0,
    @ColumnInfo(name = "isActive")
    var isActive: Int = 1,
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "location")
    var location: String?
) {
    @PrimaryKey(autoGenerate = true)
    private var id: Int?= null
}
