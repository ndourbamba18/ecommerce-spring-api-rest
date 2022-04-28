package com.ndourcodeur.ecommercespringapirest.services;

import com.ndourcodeur.ecommercespringapirest.entities.User;
import com.ndourcodeur.ecommercespringapirest.exception.UserNotFoundException;
import com.ndourcodeur.ecommercespringapirest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getUsers () {
        return repo.findAll();
    }

    @Autowired
    private PasswordEncoder bcryptEncoder;

    public User getUser (Long idUser) {
        return repo.findById(idUser).orElseThrow(() ->
                new UserNotFoundException("User by id " + idUser + " was not found."));
    }

    public User updateUser (Long idUser, User user) {
        User existingUser = getUser(idUser);

        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());
        existingUser.setAddress(user.getAddress());
        existingUser.setName(user.getName());
        existingUser.setPhone(user.getPhone());

        return repo.save(existingUser);
    }

    public void deleteUser (Long idUser) {
        repo.deleteById(idUser);
    }
}
