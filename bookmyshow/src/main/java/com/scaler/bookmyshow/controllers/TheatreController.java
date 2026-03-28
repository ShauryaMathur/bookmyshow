package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.services.TheatreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/theatres")
public class TheatreController extends BaseEntityController<Theatre> {

    public TheatreController(TheatreService service) {
        super(service);
    }
}
