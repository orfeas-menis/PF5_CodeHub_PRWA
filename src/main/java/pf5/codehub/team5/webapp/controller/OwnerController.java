package pf5.codehub.team5.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {
    @GetMapping(path = "/owner")
    public String adminHome(Model model) {

        return "owner";
    }
}
