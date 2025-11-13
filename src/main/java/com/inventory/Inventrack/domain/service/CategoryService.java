package com.inventory.Inventrack.domain.service;

import com.inventory.Inventrack.domain.dto.CategoryRequestDTO;
import com.inventory.Inventrack.domain.dto.CategoryResponseDTO;


import java.util.List;



public interface CategoryService {

    CategoryResponseDTO create(CategoryRequestDTO in);
    CategoryResponseDTO update(Long id, CategoryRequestDTO in);
    void delete(Long id);
    CategoryResponseDTO findById(Long id);
    List<CategoryResponseDTO> findAll();
}
