package com.inventory.Inventrack.domain.service.impl.customized;

import com.inventory.Inventrack.domain.entity.Category;
import com.inventory.Inventrack.domain.repository.interfaces.customized.CategoryRepository;
import com.inventory.Inventrack.domain.service.impl.ServiceGenericImpl;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryServiceImpl extends ServiceGenericImpl<Category, Long> {

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        super(categoryRepository);
    }
}
