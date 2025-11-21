package com.inventory.Inventrack.web.controller.customized;

import com.inventory.Inventrack.domain.entity.User;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import com.inventory.Inventrack.web.controller.ControllerGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends ControllerGeneric<User, Long> {
    public UserController(GenericService<User, Long> genericService) {
        super(genericService);
    }
}
