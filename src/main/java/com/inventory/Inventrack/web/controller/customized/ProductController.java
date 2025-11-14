package com.inventory.Inventrack.web.controller.customized;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import com.inventory.Inventrack.web.controller.ControllerGeneric;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
@RequiredArgsConstructor
public class ProductController {

    private final ControllerGeneric<Product, Long> controllerGeneric;
}
