package pf5.codehub.team5.webapp.mappers;

import org.springframework.stereotype.Component;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.form.UserForm;

@Component
public class UserToUserFormMapper {

    public UserForm map(User user) {
        UserForm userForm = new UserForm();
        userForm.setVat(user.getVat());
        userForm.setFirstName(user.getFirstName());
        userForm.setLastName(user.getLastName());
        userForm.setEmail(user.getEmail());
        userForm.setPhoneNumber(user.getPhoneNumber());
        userForm.setStreet(user.getStreet());
        userForm.setStreetNumber(user.getStreetNumber());
        userForm.setPostalCode(user.getPostalCode());
        userForm.setCity(user.getCity());
        userForm.setPropertyType(user.getPropertyTypes().name());
        userForm.setUserRole(user.getUserRole().name());
        userForm.setId(user.getId());

        return userForm;
    }
}
