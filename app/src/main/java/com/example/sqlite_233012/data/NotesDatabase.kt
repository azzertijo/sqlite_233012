package com.example.sqlite_233012.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Note::class],
    version = 1
)
abstract class NotesDatabase: RoomDatabase(){
    abstract val dao: NoteDao
}