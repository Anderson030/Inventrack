package com.inventory.Inventrack.web.controller.customized;

import com.inventory.Inventrack.domain.entity.Category;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import com.inventory.Inventrack.web.controller.ControllerGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController extends ControllerGeneric<Category, Long>{

    public CategoryController(GenericService<Category, Long> genericService) {
        super(genericService);
    }
}
