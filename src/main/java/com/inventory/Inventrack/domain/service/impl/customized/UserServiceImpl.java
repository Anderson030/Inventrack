package com.inventory.Inventrack.domain.service.impl.customized;

import com.inventory.Inventrack.domain.entity.User;
import com.inventory.Inventrack.domain.repository.interfaces.customized.UserRepository;
import com.inventory.Inventrack.domain.service.impl.ServiceGenericImpl;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl extends ServiceGenericImpl<User, Long> {

    public UserServiceImpl(UserRepository userRepository){
        super(userRepository);
    }
}
