package com.example.memo.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.memo.data.TodoItem

@Database(
    entities = [TodoItem::class],
    version = 1
)
abstract class ToDoItemDatabase : RoomDatabase() {

    abstract fun getDataBase(): TodoItemsDAO

    companion object {
        private const val DATABASE_FILE_NAME = "TodoItemDatabase.db"
        private val LOCK = Any()

        // as we use coroutines we need to be sure that we have correct instance
        @Volatile
        private var instance: ToDoItemDatabase? = null

        // it will be executed every time we crete ToDoItemDatabase()
        operator fun invoke(context: Context): ToDoItemDatabase {
            return instance ?: synchronized(LOCK) {
                createDataBase(context).also { instance = it }
            }
        }

        private fun createDataBase(context: Context): ToDoItemDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                ToDoItemDatabase::class.java,
                DATABASE_FILE_NAME
            ).build()
        }
    }
}