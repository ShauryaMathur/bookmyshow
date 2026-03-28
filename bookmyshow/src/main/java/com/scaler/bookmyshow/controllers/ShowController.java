package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.Show;
import com.scaler.bookmyshow.services.ShowService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shows")
public class ShowController extends BaseEntityController<Show> {

    public ShowController(ShowService service) {
        super(service);
    }
}
