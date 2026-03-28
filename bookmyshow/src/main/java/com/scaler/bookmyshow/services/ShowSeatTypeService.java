package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.ShowSeatType;
import com.scaler.bookmyshow.repositories.ShowSeatTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatTypeService extends AbstractEntityService<ShowSeatType> {

    public ShowSeatTypeService(ShowSeatTypeRepository repository) {
        super(repository);
    }
}
