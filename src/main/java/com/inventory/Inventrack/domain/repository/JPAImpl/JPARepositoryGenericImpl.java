package com.inventory.Inventrack.domain.repository.JPAImpl;

import com.inventory.Inventrack.domain.repository.GenericRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


import java.util.List;
import java.util.Optional;
@NoRepositoryBean
public class JPARepositoryGenericImpl<T, ID> implements GenericRepository<T, ID> {

    protected final Repository<T, ID> repository;

    protected JPARepositoryGenericImpl(Repository<T, ID> repository){
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
    public void deleteByID(ID id) {
        repository.deleteById(id);
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }

    @NoRepositoryBean
    public interface Repository<T, ID> extends JpaRepository<T, ID>{}
}
