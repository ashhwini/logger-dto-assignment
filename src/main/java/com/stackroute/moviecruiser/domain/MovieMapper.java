package com.stackroute.moviecruiser.domain;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MovieMapper {
    MovieMapper INSTANCE = Mappers.getMapper( MovieMapper.class );

    @Mapping( source = "movieId", target = "movieDtoId")
    @Mapping(source = "movieTitle",target = "movieDtoTitle")

    MovieDto movieToMovieDto(Movie movie);

    @InheritInverseConfiguration
    Movie movieDtoToMovie(MovieDto movieDto);
}


