package pf5.codehub.team5.webapp.service;

import org.springframework.stereotype.Service;
import pf5.codehub.team5.webapp.domain.User;

import java.util.List;
import java.util.Optional;


public interface UserService {


    Optional<User> findUser(Long id);
    List<User> getAllUsers();
//    public Optional<User> findUserByFirstNameAndLastName(String firstName, String lastName) ;
//    public Optional<User> fetchUserWithRepairsByUserId(Long id) ;

}
