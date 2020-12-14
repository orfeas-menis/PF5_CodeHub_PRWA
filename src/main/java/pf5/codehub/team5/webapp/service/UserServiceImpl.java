package pf5.codehub.team5.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.mappers.UserToUserModelMapper;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserToUserModelMapper userModelMapper;

    @Override
    public Optional<UserModel> findUser(Long id){
        return userRepository
                .findById(id)
                .map(user -> userModelMapper.map(user));
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository
                .findAll()
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
        return userRepository.fetchUserWithRepairsByUserId(id);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
}
