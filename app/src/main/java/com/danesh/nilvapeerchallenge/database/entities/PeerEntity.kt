package com.danesh.nilvapeerchallenge.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PeerEntity(
    @PrimaryKey(autoGenerate = true) val pid: Long,
    @ColumnInfo(name = "peer_name") val peerName: String? ,
    @ColumnInfo(name = "bluetooth_code") val bluetoothCode: String?
)
