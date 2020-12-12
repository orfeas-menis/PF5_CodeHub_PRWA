package pf5.codehub.team5.webapp.mappers;

import org.springframework.stereotype.Component;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.model.UserModel;

import java.time.LocalDate;

@Component
public class UserToUserModelMapper {

    public UserModel map(User user) {
        UserModel userModel = new UserModel();
        userModel.setVat(user.getVat());
        userModel.setFirstName(user.getFirstName());
        userModel.setLastName(user.getLastName());
        userModel.setEmail(user.getEmail());
        userModel.setPhoneNumber(user.getPhoneNumber());
        userModel.setStreet(user.getStreet());
        userModel.setStreetNumber(user.getStreetNumber());
        userModel.setPostalCode(user.getPostalCode());
        userModel.setCity(user.getCity());
        userModel.setPropertyTypes(user.getPropertyTypes());
        userModel.setUserRole(user.getUserRole());
        userModel.setRepairs(user.getRepairs());

        return userModel;
    }
}
