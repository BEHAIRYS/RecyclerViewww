package com.example.recyclerview;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Movies.class},version = 1)
public abstract class MovieDatabase extends RoomDatabase {

    private static MovieDatabase instance;


    public abstract MovieDao movieDao();


    public synchronized MovieDatabase getInstance(Context context){
        if(instance== null)
        {
                instance = Room.databaseBuilder(context.getApplicationContext(), MovieDatabase.class,
                        "movie_database")
                        .fallbackToDestructiveMigration()
                        .build();

        }
        return instance;

    }
    private static RoomDatabase.Callback roomCallBack = new RoomDatabase.Callback(){
        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }
    };


}
