package pf5.codehub.team5.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserHomeController {

    @GetMapping(path = "/user")
    public String userHome(Model model) {

        return "userhome";
    }


}
