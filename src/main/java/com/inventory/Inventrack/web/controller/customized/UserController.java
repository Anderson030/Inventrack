package com.inventory.Inventrack.web.controller.customized;

import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import com.inventory.Inventrack.web.controller.ControllerGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController extends ControllerGeneric<UserController, Long> {
    public UserController(GenericService<UserController, Long> genericService) {
        super(genericService);
    }
}
