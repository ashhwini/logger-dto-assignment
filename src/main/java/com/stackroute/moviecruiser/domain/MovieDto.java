package com.stackroute.moviecruiser.domain;


public class MovieDto {
    private String movieDtoTitle;
    private int movieDtoId;
    private String movieDtoInfo;

    public String getMovieDtoTitle() {
        return movieDtoTitle;
    }

    public void setMovieDtoTitle(String movieDtoTitle) {
        this.movieDtoTitle = movieDtoTitle;
    }

    public int getMovieDtoId() {
        return movieDtoId;
    }

    public void setMovieDtoId(int movieDtoId) {
        this.movieDtoId = movieDtoId;
    }

    public String getMovieDtoInfo() {
        return movieDtoInfo;
    }

    public void setMovieDtoInfo(String movieDtoInfo) {
        this.movieDtoInfo = movieDtoInfo;
    }
}
