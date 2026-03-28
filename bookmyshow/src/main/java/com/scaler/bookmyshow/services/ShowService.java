package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.Show;
import com.scaler.bookmyshow.repositories.ShowRepository;
import org.springframework.stereotype.Service;

@Service
public class ShowService extends AbstractEntityService<Show> {

    public ShowService(ShowRepository repository) {
        super(repository);
    }
}
