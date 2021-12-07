package com.danesh.nilvapeerchallenge

interface Constants {
    companion object {
        const val SHARED_PREFERENCES = "MY_SHARED_PREFERENCES"
        const val DATABASE_NAME = "peer_database"

        //message statuses
        const val MESSAGE_SENT = 0
        const val MESSAGE_DELIVERED = 1
    }
}