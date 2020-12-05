package pf5.codehub.team5.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> findUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

//    @Override
//    public Optional<User> findUserByFirstNameAndLastName(String firstName, String lastName) {
//        return userRepository.findUserByFirstNameAndLastName(firstName,lastName);
//    }

//    @Override
//    public Optional<User> fetchUserWithRepairsByUserId(Long id) {
//
//    }
}
