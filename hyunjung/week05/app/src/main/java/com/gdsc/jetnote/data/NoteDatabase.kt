package com.gdsc.jetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gdsc.jetnote.model.Note
import com.gdsc.jetnote.util.DateConverter
import com.gdsc.jetnote.util.UUIDConverter

@Database(entities=[Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase:RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}