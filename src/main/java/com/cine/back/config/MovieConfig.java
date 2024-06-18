package com.cine.back.config;

import java.io.IOException;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.cine.back.movieList.entity.MovieDetailEntity;
import com.cine.back.movieList.response.MovieResponse;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Slf4j
@Component
public class MovieConfig {

    // 영화 목록
    @Value("${movieList.access-token}")
    private String accessToken;

    @Value("${movieList.urlHead}")
    private String urlHead;

    @Value("${movieList.urlTail}")
    private String urlTail;
    
    @Value("${movieList.urlweek}")
    private String week; 
    
    // 상세 정보
    @Value("${movieDetail.urlHead}")
    private String urlDetailHead;
    
    @Value("${movieDetail.urlTail}")
    private String urlDetailTail;

    private final OkHttpClient client = new OkHttpClient();

    // 영화 목록
    public MovieResponse fetchList(int page) throws IOException {
        String url = urlHead + week + urlTail;
        Request request = new Request.Builder()
            .url(url + page)
            .get()
            .addHeader("accept", "application/json")
            .addHeader("Authorization", "Bearer " + accessToken)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("잘못된 응답 : " + response);
            }

            String responseBody = response.body().string();
            return parseTrendMovieResponse(responseBody);
        }
    }

    // 상세 정보
    public Optional<MovieDetailEntity> fetchMovieDetails(int movieId) {
        Request request = new Request.Builder()
            .url(urlDetailHead + movieId + urlDetailTail)
            .get()
            .addHeader("accept", "application/json")
            .addHeader("Authorization", "Bearer " + accessToken)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            String responseBody = response.body().string();
            return Optional.of(parseMovieDetails(responseBody));
        } catch (IOException e) {
            log.error("Error fetching movie details for movieId: " + movieId, e);
            return Optional.empty();
        }
    }

    private MovieResponse parseTrendMovieResponse(String responseBody) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseBody, MovieResponse.class);
    }

    // 상세 정보 객체화
    private MovieDetailEntity parseMovieDetails(String responseBody) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseBody, MovieDetailEntity.class);
    }
}