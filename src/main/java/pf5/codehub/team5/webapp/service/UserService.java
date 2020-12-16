package pf5.codehub.team5.webapp.service;

import org.springframework.stereotype.Service;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.form.UserForm;
import pf5.codehub.team5.webapp.model.UserModel;

import java.util.List;
import java.util.Optional;


public interface UserService {

    Optional<User> findUser(Long id);
//    Optional<UserModel> findByFirstNameAndLastName(String firstName, String lastName);
    List<UserModel> findAll();
    Optional<UserModel> findByEmail(String email);
    Optional<UserModel> findByVat(String vat);
    Optional<User> fetchUserWithRepairsByUserId(Long id);
    Optional<UserModel> findById(Long id);
    UserModel createUser(UserForm userForm);
    Optional<UserForm> findUserForm(Long id);
    UserModel updateUser(UserForm userForm);
    void deleteById(Long id);
    List<UserModel> findFirst10();
}
