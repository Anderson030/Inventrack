package com.inventory.Inventrack.domain.service.impl;

import com.inventory.Inventrack.domain.repo.GenericRepository;
import com.inventory.Inventrack.domain.service.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public abstract class AbstractServiceGenericImplement<T, ID> implements GenericService<T, ID> {

    protected final GenericRepository<T, ID> repository;

    protected AbstractServiceGenericImplement(GenericRepository<T, ID> repository){
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return List.of();
    }

    @Override
    public void deleteByID(ID id) {

    }

    @Override
    public boolean existsById(ID id) {
        return false;
    }
}
