package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.service.UserServiceImpl;

import java.util.List;


@Controller
public class OwnerController {

    private static final String USERS_LIST = "users";

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(path = "/owner")
    public String ownerTab(Model model, @RequestParam(value = "id", required = false, defaultValue = "1") Long id) {
        List<UserModel> users = userService.findAll();
        model.addAttribute(USERS_LIST,users);
        return "owner";
    }



}
