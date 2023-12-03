package net.nurlans.jobnomad.service;

import net.nurlans.jobnomad.model.User;
import net.nurlans.jobnomad.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.getUserById(id);
    }
}
