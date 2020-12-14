package pf5.codehub.team5.webapp.mappers;

import org.springframework.stereotype.Component;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.enums.PropertyType;
import pf5.codehub.team5.webapp.enums.UserRole;
import pf5.codehub.team5.webapp.form.UserForm;

@Component
public class UserFormToUserMapper {

    public User map(UserForm userForm){
        User user = new User();
        user.setCity(userForm.getCity());
        user.setEmail(userForm.getEmail());
        user.setFirstName(userForm.getFirstName());
        user.setLastName(userForm.getLastName());
        user.setUserRole(UserRole.valueOf(userForm.getUserRole()));
        user.setPhoneNumber(userForm.getPhoneNumber());
        user.setPostalCode(userForm.getPostalCode());
        user.setPropertyTypes(PropertyType.valueOf(userForm.getPropertyType()));
        user.setStreet(userForm.getStreet());
        user.setStreetNumber(userForm.getStreetNumber());
        user.setVat(userForm.getVat());
        user.setPassword(userForm.getPassword());
        return user;
    }
}
