//package pf5.codehub.team5.webapp.validators;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
//import pf5.codehub.team5.webapp.form.RepairForm;
//import pf5.codehub.team5.webapp.form.UserForm;
//import pf5.codehub.team5.webapp.model.UserModel;
//import pf5.codehub.team5.webapp.service.RepairService;
//
//import java.util.Optional;
//
//public class RepairCreateValidator implements Validator {
//
//    @Autowired
//    private RepairService repairService;
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return RepairForm.class.isAssignableFrom(aClass);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        RepairForm repairForm = (RepairForm) target;
//        //Check if already exists user with the provided email or VAT
//        Optional<UserModel> usersWithGivenEmail = userService.findByEmail(userForm.getEmail());
//        if (usersWithGivenEmail.isPresent()) {
//            errors.rejectValue("email", "register.email.taken.error");
//        }
//        Optional<UserModel> usersWithGivenVat = userService.findByVat(userForm.getVat());
//        if (usersWithGivenVat.isPresent()) {
//            errors.rejectValue("email", "register.vat.taken.error");
//        }
//        //We only accept postal codes that consist of exactly 5 digits
//        String postalCodeRegex = "\\b\\d{5}\\b";
//        if (!userForm.getPostalCode().matches(postalCodeRegex)){
//            errors.rejectValue("postalCode", "register.postalCode.format.error");
//        }
//        //Phone number Regex found here: https://regexr.com/3c53v
//        String phoneNumberRegex = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";
//        if (!userForm.getPhoneNumber().matches(phoneNumberRegex)){
//            errors.rejectValue("phoneNumber", "register.phoneNumber.format.error");
//        }
//        //Accept only numbers for streetNumber
//        String streetNumberRegex = "^\\d*$";
//        if (!userForm.getStreetNumber().matches(streetNumberRegex)){
//            errors.rejectValue("streetNumber", "register.streetNumber.format.error");
//        }
//        //We only accept VAT numbers that are consist of exactly 9 digits
//        String vatRegex = "\\b\\d{9}\\b";
//        if (!userForm.getVat().matches(vatRegex)){
//            errors.rejectValue("vat", "register.vat.format.error");
//        }
//        // Or use reject if empty or whitespace
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "register.name.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "register.name.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "register.city.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "street", "register.street.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "streetNumber", "register.streetNumber.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "postalCode", "register.postalCode.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "register.password.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "register.phoneNumber.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "vat", "register.vat.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "register.email.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "propertyType", "register.propertyType.not.null");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userRole", "register.userRole.not.null");
//    }
//}
