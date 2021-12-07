package com.danesh.nilvapeerchallenge.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Messages")
data class MessageEntity(
    @PrimaryKey(autoGenerate = true) val mid : Long,
    @ColumnInfo(name = "isMine", defaultValue = "FALSE") val isMine: Boolean,
    @ColumnInfo(name = "message") val message: String?,
    @ColumnInfo(name = "pid") val peerId: Long,
    @ColumnInfo(name = "status") val messageStatus: Int

)
