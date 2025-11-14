package com.inventory.Inventrack.domain.repository;

import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface GenericRepository<T, ID>{

    T save(T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    void deleteByID(ID id);
    boolean existsById(ID id);
}
