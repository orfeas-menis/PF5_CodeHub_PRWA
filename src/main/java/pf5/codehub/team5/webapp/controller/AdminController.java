package pf5.codehub.team5.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping(path = "/admin")
    public String adminHome(Model model) {
        return "adminhome";
    }
}
