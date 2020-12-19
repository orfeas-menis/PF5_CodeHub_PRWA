package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pf5.codehub.team5.webapp.enums.PropertyType;
import pf5.codehub.team5.webapp.enums.UserRole;
import pf5.codehub.team5.webapp.form.UserForm;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.service.UserService;
import pf5.codehub.team5.webapp.validators.UserCreateValidator;
import pf5.codehub.team5.webapp.validators.UserEditValidator;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class OwnerController {

    private static final String USERS_LIST = "users";
    private static final String USER = "user";
    private static final String CREATE_FORM = "createForm";
    private static final String EDIT_FORM = "editForm";
    private static final String USER_ROLES = "userRoles";
    private static final String PROPERTY_TYPES = "propertyTypes";
    private static final String ERROR_MESSAGE = "errorMessage";

    @InitBinder(CREATE_FORM)
    protected void initBinderCreate(final WebDataBinder binder) {
        binder.addValidators(userCreateValidator);
    }

    @InitBinder(EDIT_FORM)
    protected void initBinderEdit(final WebDataBinder binder) {
        binder.addValidators(userEditValidator);
    }

    @Autowired
    private UserService userService;

    @Autowired
    private UserCreateValidator userCreateValidator;

    @Autowired
    private UserEditValidator userEditValidator;

    @GetMapping(path = "/admin/owner")
    public String ownerTab(Model model) {
        List<UserModel> users = userService.findFirst10();
        model.addAttribute(USERS_LIST, users);
        return "owner";
    }

    @PostMapping(path = "/admin/search-vat")
    public String searchPostVat(Model model, @RequestParam String parameter) {
        Optional<UserModel> user = userService.findByVat(parameter);
        List<UserModel> users = new ArrayList<UserModel>();
        if (user.isPresent()){
            users.add(user.get());
        }
        model.addAttribute(USERS_LIST, users);

        return "owner";
    }


    @PostMapping(path = "/admin/search-email")
    public String searchPostEmail(Model model, @RequestParam String parameter) {
        Optional<UserModel> user = userService.findByEmail(parameter);
        List<UserModel> users = new ArrayList<UserModel>();
        if (user.isPresent()){
            users.add(user.get());
        }
        model.addAttribute(USERS_LIST, users);

        return "owner";
    }

    @GetMapping("/admin/owner/{id}/edit")
    public String editUser(@PathVariable Long id, Model model) {
        Optional<UserModel> optModel = userService.findById(id);
        if (optModel.isPresent()) {
            UserModel userModel = optModel.get();
            model.addAttribute(USER, userModel);
            model.addAttribute(USER_ROLES, UserRole.values());
            model.addAttribute(PROPERTY_TYPES, PropertyType.values());
        } else {
            model.addAttribute(ERROR_MESSAGE, "user does not exist");
            return "redirect:/admin/owner";
        }
        return "user_edit";
    }

    @PostMapping(value = "/admin/owner/edit")
    public String editUser(Model model,
                           @Valid @ModelAttribute(EDIT_FORM) UserForm userForm,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            if (userForm.getId() != null) {
                return "redirect:/admin/owner/" + userForm.getId().toString() + "/edit";
            } else {
                return "redirect:/admin/owner";
            }
        }
        UserModel userModel = userService.updateUser(userForm);
        return "redirect:/admin/owner";
    }


    @PostMapping("/admin/owner/{id}/delete")
    public String deleteUser(@PathVariable Long id) {
        String response = userService.deleteById(id);
        return "redirect:/admin/owner";
    }

    @GetMapping("/admin/owner/create")
    public String ownerDynamic(Model model) {
        model.addAttribute(CREATE_FORM, new UserForm());
        model.addAttribute(USER_ROLES, UserRole.values());
        model.addAttribute(PROPERTY_TYPES, PropertyType.values());
        return "owner_create";
    }

    @PostMapping("/admin/owner/create")
    public String ownerCreate(Model model,
                              @Valid @ModelAttribute(CREATE_FORM) UserForm userForm,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            model.addAttribute(CREATE_FORM, userForm);
            model.addAttribute(USER_ROLES, UserRole.values());
            model.addAttribute(PROPERTY_TYPES, PropertyType.values());
            return "owner_create";
        }
        UserModel userModel = userService.createUser(userForm);
//        redirectAttributes.addAttribute("id", userModel.getId());
        //we can display the created user if we take the response from createUser and put it as an attribute
        //we have to also make frontend validation
        //we have to see what happens with password
        return "redirect:/admin/owner";
    }

}
