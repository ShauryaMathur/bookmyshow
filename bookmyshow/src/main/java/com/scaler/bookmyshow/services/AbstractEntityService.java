package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractEntityService<T extends BaseModel> implements BaseEntityService<T> {

    private final JpaRepository<T, Long> repository;

    protected AbstractEntityService(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public T create(T entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    @Override
    public T update(Long id, T entity) {
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }
}
