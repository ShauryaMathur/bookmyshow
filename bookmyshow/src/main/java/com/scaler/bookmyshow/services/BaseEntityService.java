package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.BaseModel;

import java.util.List;
import java.util.Optional;

public interface BaseEntityService<T extends BaseModel> {

    List<T> getAll();

    Optional<T> getById(Long id);

    T create(T entity);

    T update(Long id, T entity);

    void delete(Long id);

    boolean existsById(Long id);
}
