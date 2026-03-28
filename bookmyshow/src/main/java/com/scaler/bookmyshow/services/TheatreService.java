package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.repositories.TheatreRepository;
import org.springframework.stereotype.Service;

@Service
public class TheatreService extends AbstractEntityService<Theatre> {

    public TheatreService(TheatreRepository repository) {
        super(repository);
    }
}
