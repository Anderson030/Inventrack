package com.inventory.Inventrack.domain.service;

import com.inventory.Inventrack.domain.entity.User;
import com.inventory.Inventrack.domain.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User save(User user){
        return userRepo.save(user);
    }

    public Optional<User> findById(Long id){
        return userRepo.findById(id);
    }

    public List<User> findAll(){
        return userRepo.findAll();
    }

    public void delete(Long id){
        userRepo.deleteById(id);
    }
}
