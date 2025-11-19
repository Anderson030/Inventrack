package com.inventory.Inventrack.domain.service.impl;

import com.inventory.Inventrack.domain.repository.interfaces.GenericRepository;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class ServiceGenericImpl<T, ID> implements GenericService<T, ID> {

    protected GenericRepository<T, ID> repository;

    protected ServiceGenericImpl(GenericRepository<T, ID> repository){
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }
}
