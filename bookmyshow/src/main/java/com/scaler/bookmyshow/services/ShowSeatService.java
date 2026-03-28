package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.ShowSeat;
import com.scaler.bookmyshow.repositories.ShowSeatRepository;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatService extends AbstractEntityService<ShowSeat> {

    public ShowSeatService(ShowSeatRepository repository) {
        super(repository);
    }
}
