package pf5.codehub.team5.webapp.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pf5.codehub.team5.webapp.form.RepairForm;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.service.RepairService;
import pf5.codehub.team5.webapp.service.UserService;

import java.util.Optional;

@Component
public class RepairEditValidator implements Validator {

    @Autowired
    private RepairService repairService;

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return RepairForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RepairForm repairForm = (RepairForm) target;
        //Check if user with VAT exists
        Optional<UserModel> optUser = userService.findByVat(repairForm.getVat());
        if (!optUser.isPresent()) {
            errors.rejectValue("vat", "repair.vat.notexists");
        }
    }
}
