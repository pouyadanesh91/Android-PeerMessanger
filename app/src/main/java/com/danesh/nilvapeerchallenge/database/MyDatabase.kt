package com.danesh.nilvapeerchallenge.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.danesh.nilvapeerchallenge.database.entities.MessageEntity
import com.danesh.nilvapeerchallenge.database.entities.PeerEntity

@Database(
    entities = [
        PeerEntity::class,
        MessageEntity::class
    ], version = 1
)
abstract class MyDatabase : RoomDatabase() {
    abstract fun myDao(): MyDao
}