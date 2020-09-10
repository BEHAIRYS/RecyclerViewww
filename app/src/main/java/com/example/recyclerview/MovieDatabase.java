package com.example.recyclerview;

import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Movies.class},version = 1)
public abstract class MovieDatabase extends RoomDatabase {

    private static MovieDatabase instance;
    private static final Object LOCK=new Object();
    private static final String LOG_TAG= MovieDatabase.class.getSimpleName();

    public abstract MovieDao movieDao();


    public synchronized MovieDatabase getInstance(Context context){
        if(instance== null)
        {
            synchronized (LOCK) {
                Log.d(LOG_TAG,"create new database instance");
                instance = Room.databaseBuilder(context.getApplicationContext(), MovieDatabase.class,
                        "movie_database")
                        .fallbackToDestructiveMigration()
                        .build();
            }
        }
        return instance;

    }

}
