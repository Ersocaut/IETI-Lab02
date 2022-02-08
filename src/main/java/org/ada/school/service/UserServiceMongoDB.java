package org.ada.school.service;

import org.ada.school.model.User;
import org.ada.school.dto.*;
import org.ada.school.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceMongoDB implements UserService{

    private UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        userRepository.save(user);
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public User update(UserDto userDto, String id) {
        return null;
    }
}
