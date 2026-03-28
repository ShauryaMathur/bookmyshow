package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.Screen;
import com.scaler.bookmyshow.repositories.ScreenRepository;
import org.springframework.stereotype.Service;

@Service
public class ScreenService extends AbstractEntityService<Screen> {

    public ScreenService(ScreenRepository repository) {
        super(repository);
    }
}
