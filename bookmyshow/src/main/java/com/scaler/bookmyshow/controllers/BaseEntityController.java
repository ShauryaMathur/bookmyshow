package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.BaseModel;
import com.scaler.bookmyshow.services.BaseEntityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public abstract class BaseEntityController<T extends BaseModel> {

    private final BaseEntityService<T> service;

    protected BaseEntityController(BaseEntityService<T> service) {
        this.service = service;
    }

    @GetMapping
    public List<T> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable Long id) {
        Optional<T> entity = service.getById(id);
        return entity.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public T create(@RequestBody T entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable Long id, @RequestBody T entity) {
        if (!service.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.update(id, entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
