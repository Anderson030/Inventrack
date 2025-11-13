package com.inventory.Inventrack.domain.service.impl;

import com.inventory.Inventrack.domain.dto.*;
import com.inventory.Inventrack.domain.entity.Category;
import com.inventory.Inventrack.domain.repo.CategoryRepo;
import com.inventory.Inventrack.domain.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public CategoryResponseDTO create(CategoryRequestDTO dto) {
        Category c = new Category();
        c.setName(dto.getName());
        c = categoryRepo.save(c);
        return toResponse(c);
    }

    @Override
    public CategoryResponseDTO update(Long id, CategoryRequestDTO dto) {
        Category c = categoryRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
        c.setName(dto.getName());
        c = categoryRepo.save(c);
        return toResponse(c);
    }

    @Override
    public void delete(Long id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public List<CategoryResponseDTO> findAll() {
        return categoryRepo.findAll().stream().map(this::toResponse).toList();
    }

    @Override
    public CategoryResponseDTO findById(Long id) {
        Category c = categoryRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
        return toResponse(c);
    }

    private CategoryResponseDTO toResponse(Category c) {
        return new CategoryResponseDTO(c.getId(), c.getName());
    }
}
