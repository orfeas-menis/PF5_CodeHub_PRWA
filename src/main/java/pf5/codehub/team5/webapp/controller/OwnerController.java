package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pf5.codehub.team5.webapp.form.SearchForm;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.service.UserServiceImpl;
import java.util.List;


@Controller
public class OwnerController {

    private static final String USERS_LIST = "users";

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(path = "/owner")
    public String ownerTab(Model model) {
        List<UserModel> users = userService.findAll();
        model.addAttribute(USERS_LIST,users);
        return "owner";
    }

    @GetMapping("/search")
    public String searchTest(Model model) {
        model.addAttribute("searchForm", new SearchForm());
        return "search";
    }

    @GetMapping(path = "/owner-edit")
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
