package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.Screen;
import com.scaler.bookmyshow.services.ScreenService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/screens")
public class ScreenController extends BaseEntityController<Screen> {

    public ScreenController(ScreenService service) {
        super(service);
    }
}
