package com.danesh.nilvapeerchallenge.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.danesh.nilvapeerchallenge.database.entities.MessageEntity

@Dao
interface MyDao {

    //get Messages from a specific peer
    @Query("SELECT * FROM Messages WHERE pid = (:pid)")
    fun getPeerMessages(pid : Long): LiveData<List<MessageEntity>>


}