package com.stackroute.moviecruiser.domain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MovieMapperTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldMapMovieDto() {
        //given
       // Movie movie = new Movie( "pk", 1, "movie" );
        Movie movie = new Movie();
        movie.setMovieId(1);
        movie.setMovieTitle("pk");
        //when
        MovieDto movieDto = MovieMapper.INSTANCE.movieToMovieDto( movie );
        movieDto.setMovieDtoId(1);
        movieDto.setMovieDtoTitle("pk");
        //then
        assertEquals(movieDto.getMovieDtoId(), movie.getMovieId());
        assertEquals(movieDto.getMovieDtoTitle(), movie.getMovieTitle());

    }
}