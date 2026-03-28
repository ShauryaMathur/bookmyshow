package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.Movie;
import com.scaler.bookmyshow.services.MovieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController extends BaseEntityController<Movie> {

    public MovieController(MovieService service) {
        super(service);
    }
}
