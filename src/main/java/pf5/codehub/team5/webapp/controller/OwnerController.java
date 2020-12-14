package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pf5.codehub.team5.webapp.enums.PropertyType;
import pf5.codehub.team5.webapp.enums.UserRole;
import pf5.codehub.team5.webapp.form.UserForm;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.service.UserServiceImpl;
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


    @Autowired
    private UserServiceImpl userService;

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


    @PostMapping("/owner/create")
    public String ownerCreate(Model model,  @Valid @ModelAttribute(USER_FORM) UserForm userForm,
                              BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
//            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "ownerCreate";
        }
        userService.createUser(userForm);
        //we can display the created user if we take the response from createUser and put it as an attribute
        //we have to make some validations and also see what happens with password
        return "redirect:/owner";
    }




}
