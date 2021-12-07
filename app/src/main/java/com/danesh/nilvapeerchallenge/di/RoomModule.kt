package com.danesh.nilvapeerchallenge.di

import android.content.Context
import androidx.room.Room
import com.danesh.nilvapeerchallenge.Constants.Companion.DATABASE_NAME
import com.danesh.nilvapeerchallenge.database.MyDao
import com.danesh.nilvapeerchallenge.database.MyDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RoomModule {

    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext context: Context): MyDatabase {
        return Room.databaseBuilder(
            context, MyDatabase::class.java, DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideDao(dataBase: MyDatabase): MyDao {
        return dataBase.myDao()
    }
}