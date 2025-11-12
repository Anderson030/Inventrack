package com.inventory.Inventrack.domain.service;

import com.inventory.Inventrack.domain.entity.Category;
import com.inventory.Inventrack.domain.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category save(Category category){
        return categoryRepo.save(category);
    }

    public Optional<Category> findById(Long id){
        return categoryRepo.findById(id);
    }

    public List<Category> findAll(){
        return categoryRepo.findAll();
    }

    public void delete(Long id){
        categoryRepo.deleteById(id);
    }
}
