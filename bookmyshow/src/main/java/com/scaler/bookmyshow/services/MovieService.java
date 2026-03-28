package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.Movie;
import com.scaler.bookmyshow.repositories.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService extends AbstractEntityService<Movie> {

    public MovieService(MovieRepository repository) {
        super(repository);
    }
}
