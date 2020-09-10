package com.example.recyclerview;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "movie_table")
public class Movies {
    private String title;
    private String description;
    private float rating;
    @PrimaryKey(autoGenerate = true)
    private int id;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public float getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

    public Movies(String title, String description, float rating) {
        this.title = title;
        this.description = description;
        this.rating = rating;
    }

    public void setId(int id) {
        this.id = id;
    }

}
