package com.cine.back.movieList.service;

import org.springframework.stereotype.Service;

import com.cine.back.movieList.entity.MovieDetailEntity;
import com.cine.back.movieList.repository.MovieDetailRepository;

import java.util.*;

@Service
public class MovieListService {
    private final MovieDetailRepository movieDetailRepository;

    public MovieListService (MovieDetailRepository movieDetailRepository){
        this.movieDetailRepository = movieDetailRepository;
    }

    public List<MovieDetailEntity> getMovieGernes(String genre){
        List<MovieDetailEntity> movieGenres = movieDetailRepository.findByGenres(genre);
        return movieGenres;
    }

    public List<MovieDetailEntity> getMovieActors(String actor){
        List<MovieDetailEntity> movieActors = movieDetailRepository.findByActors(actor);
        return movieActors;
    }

    public Optional<MovieDetailEntity> getMovieDetail(int movieId){
        Optional<MovieDetailEntity> movieDetail = movieDetailRepository.findByMovieId(movieId);
        return movieDetail;
    }
    
}