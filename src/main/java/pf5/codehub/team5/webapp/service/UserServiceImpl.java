package pf5.codehub.team5.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.form.UserForm;
import pf5.codehub.team5.webapp.mappers.UserFormToUserMapper;
import pf5.codehub.team5.webapp.mappers.UserToUserFormMapper;
import pf5.codehub.team5.webapp.mappers.UserToUserModelMapper;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.repository.RepairRepository;
import pf5.codehub.team5.webapp.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RepairRepository repairRepository;

    @Autowired
    private UserToUserModelMapper userModelMapper;

    @Autowired
    private UserToUserFormMapper userFormMapper;

    @Autowired
    private UserFormToUserMapper userMapper;

    @Override
    public Optional<User> findUser(Long id) {
        return userRepository
                .findById(id);
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository
                .findAll()
                .stream()
                .map(user -> userModelMapper.map(user))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserModel> findFirst10() {
        return userRepository
                .findFirst10By()
                .stream()
                .map(user -> userModelMapper.map(user))
                .collect(Collectors.toList());
    }

//    @Override
//    public Optional<UserModel> findByFirstNameAndLastName(String firstName, String lastName) {
//        return userRepository
//                .findByFirstNameAndLastName(firstName,lastName)
//                .map(user -> userModelMapper.map(user));
//    }

    @Override
    public Optional<UserModel> findByEmail(String email) {
        return userRepository
                .findByEmail(email)
                .map(user -> userModelMapper.map(user));
    }

    @Override
    public Optional<UserModel> findByVat(String vat) {
        return userRepository
                .findByVat(vat)
                .map(user -> userModelMapper.map(user));
    }

    @Override
    public Optional<User> fetchUserWithRepairsByUserId(Long id) {
        return userRepository
                .fetchUserWithRepairsByUserId(id);
    }

    @Override
    public Optional<UserModel> findById(Long id) {
        return userRepository
                .findById(id)
                .map(user -> userModelMapper.map(user));
    }

    @Override
    public UserModel createUser(UserForm userForm) {
        User user = userMapper.map(userForm);
        User newUser = userRepository.save(user);
        return userModelMapper.map(newUser);
    }

    @Override
    public UserModel updateUser(UserForm userForm) {
        User user = userMapper.map(userForm);
        User newUser = userRepository.save(user);
        return userModelMapper.map(newUser);
    }

    @Override
    public Optional<UserForm> findUserForm(Long id) {
        return userRepository
                .findById(id)
                .map(user -> userFormMapper.map(user));
    }

    @Override
    public String deleteById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            if (repairRepository.findByUser(user.get()).isEmpty()) {
                userRepository.deleteById(id);
                return "OK";
            }
            else{
                return "User has repairs";
            }
        }
        else{
            return "User does not exist";
        }
    }
}
