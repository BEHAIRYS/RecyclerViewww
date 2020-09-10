package com.example.recyclerview;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MovieDao {
    @Insert
    void insert(Movies movie);
    @Update
    void update(Movies movie);
    @Delete
    void delete(Movies movie);
    @Query("Delete From movie_table")
    void deleteAllNotes();
    @Query("Select * From movie_table Order BY rating DESC")
    LiveData<List<Movies>> getAllMovies();
}
