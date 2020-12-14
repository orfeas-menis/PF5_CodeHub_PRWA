package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.service.UserServiceImpl;

import java.util.List;
import java.util.Optional;


@Controller
public class OwnerController {

    private static final String USERS_LIST = "users";
    private static final String USER= "user";

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

    @GetMapping( "/owner-edit")
    public String ownerEdit(Model model) {
        List<UserModel> users = userService.findAll();
        model.addAttribute(USERS_LIST,users);
        return "ownerEdit";
    }


   @PostMapping("/owner-edit")
    public String ownerEdit(Model model, @RequestParam String lastName) {
//       System.out.println(lastName);
//        UserModel user = userService.findUser(id).orElseThrow();
//        model.addAttribute("user", user);
        return "redirect:/owner";
    }




}
