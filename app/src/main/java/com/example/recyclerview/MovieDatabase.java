package com.example.recyclerview;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Movies.class},version = 1)
public abstract class MovieDatabase extends RoomDatabase {

    private static MovieDatabase instance;
    public abstract MovieDao noteDao();
    public synchronized MovieDatabase getInstance(Context context){
        if(instance== null)
        {
            instance= Room.databaseBuilder(context.getApplicationContext(),MovieDatabase.class,
                    "note_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;

    }

}
