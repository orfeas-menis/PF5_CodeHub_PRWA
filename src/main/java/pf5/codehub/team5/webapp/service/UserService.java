package pf5.codehub.team5.webapp.service;

import org.springframework.stereotype.Service;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.model.UserModel;

import java.util.List;
import java.util.Optional;


public interface UserService {

    Optional<UserModel> findUser(Long id);

//    Optional<User> findUser(Long id);
//    List<User> getAllUsers();
    List<UserModel> findAll();
//    public Optional<User> findUserByFirstNameAndLastName(String firstName, String lastName) ;
//    public Optional<User> fetchUserWithRepairsByUserId(Long id) ;

}
