package org.cheztone.backend.service;

import org.cheztone.backend.model.User;
import org.cheztone.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public User get(String id) {
        return userRepository.findOne(id);
    }

}
