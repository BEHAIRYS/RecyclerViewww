package com.example.recyclerview;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class MovieRepository {
    private MovieDao movieDao;
    private LiveData<List<Movies>> allMovies;


    public MovieRepository(Application application)
    {
        MovieDatabase database= null;
        database.getInstance(application);
        movieDao=database.movieDao();
        allMovies=movieDao.getAllMovies();

    }
    public void insert(Movies movie)
    {
        new insertMovieAsyncTask(movieDao).execute(movie);

    }
    public void update(Movies movie)
    {
        new updateMovieAsyncTask(movieDao).execute(movie);

    }
    public void delete(Movies movie)
    {
        new deleteMovieAsyncTask(movieDao).execute(movie);

    }
    public void deleteAllMovies(Movies movie)
    {
        new deleteAllMovieAsyncTask(movieDao).execute(movie);

    }

    public LiveData<List<Movies>> getAllMovies() {
        return allMovies;
    }
    private static class insertMovieAsyncTask extends AsyncTask<Movies,Void,Void>
    {
        private MovieDao moviedao;
        private insertMovieAsyncTask(MovieDao movieDao)
        {
            this.moviedao=movieDao;
        }
        @Override
        protected Void doInBackground(Movies... movies) {
            moviedao.insert(movies[0]);
            return null;
        }
    }
    private static class updateMovieAsyncTask extends AsyncTask<Movies,Void,Void>
    {
        private MovieDao moviedao;
        private updateMovieAsyncTask(MovieDao movieDao)
        {
            this.moviedao=movieDao;
        }
        @Override
        protected Void doInBackground(Movies... movies) {
            moviedao.update(movies[0]);
            return null;
        }
    }
    private static class deleteMovieAsyncTask extends AsyncTask<Movies,Void,Void>
    {
        private MovieDao moviedao;
        private deleteMovieAsyncTask(MovieDao movieDao)
        {
            this.moviedao=movieDao;
        }
        @Override
        protected Void doInBackground(Movies... movies) {
            moviedao.delete(movies[0]);
            return null;
        }
    }
    private static class deleteAllMovieAsyncTask extends AsyncTask<Movies,Void,Void>
    {
        private MovieDao moviedao;
        private deleteAllMovieAsyncTask(MovieDao movieDao)
        {
            this.moviedao=movieDao;
        }
        @Override
        protected Void doInBackground(Movies... movies) {
            moviedao.deleteAllNotes();
            return null;
        }
    }

}
