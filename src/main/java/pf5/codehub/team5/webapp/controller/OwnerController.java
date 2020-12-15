package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.enums.PropertyType;
import pf5.codehub.team5.webapp.enums.UserRole;
import pf5.codehub.team5.webapp.form.UserForm;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.service.UserServiceImpl;
import pf5.codehub.team5.webapp.validators.UserCreateValidator;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@Controller
public class OwnerController {

    private static final String USERS_LIST = "users";
    private static final String USER= "user";
    private static final String USER_FORM= "userForm";
    private static final String USER_ROLES= "userRoles";
    private static final String PROPERTY_TYPES= "propertyTypes";
    private static final String ERROR_MESSAGE = "errorMessage";



    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private UserCreateValidator userCreateValidator;

    @GetMapping(path = "/owner")
    public String ownerTab(Model model) {
        List<UserModel> users = userService.findAll();
        model.addAttribute(USERS_LIST,users);
        return "owner";
    }

//    @GetMapping(path = "/search")
//    public String searchGet() {
//        return "search";
//    }

    @PostMapping(path = "/search")
    public String searchPost(Model model,@RequestParam String email) {
        System.out.println(email);
        Optional<UserModel> user = userService.findByEmail(email);
        model.addAttribute(USER, user );

        return "search";
    }

    @GetMapping( "/owner/edit")
    public String ownerEdit(Model model) {
        List<UserModel> users = userService.findAll();
        model.addAttribute(USERS_LIST,users);
        return "ownerEdit";
    }


   @PostMapping("/owner/edit")
    public String ownerEdit(Model model, @RequestParam String lastName) {
//       System.out.println(lastName);
//        UserModel user = userService.findUser(id).orElseThrow();
//        model.addAttribute("user", user);
        return "redirect:/owner";
    }

    @GetMapping( "/owner/create")
    public String ownerDynamic(Model model) {
        model.addAttribute(USER_FORM, new UserForm());
        model.addAttribute(USER_ROLES, UserRole.values());
        model.addAttribute(PROPERTY_TYPES, PropertyType.values());
        return "ownerCreate";
    }

    @InitBinder(USER_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(userCreateValidator);
    }

    @PostMapping("/owner/create")
    public String ownerCreate(Model model,
                              @Valid @ModelAttribute(USER_FORM) UserForm userForm,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            return "ownerCreate";
        }
        UserModel userModel = userService.createUser(userForm);
//        redirectAttributes.addAttribute("id", userModel.getId());
        //we can display the created user if we take the response from createUser and put it as an attribute
        //we have to also make frontend validation
        //we have to see what happens with password
        return "redirect:/owner";
    }




}
