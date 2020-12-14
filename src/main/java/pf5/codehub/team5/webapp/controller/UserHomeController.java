package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.model.RepairModel;
import pf5.codehub.team5.webapp.service.RepairServiceImpl;
import pf5.codehub.team5.webapp.service.UserServiceImpl;

import java.util.List;
import java.util.Optional;

@Controller
public class UserHomeController {

    private static final String REPAIRS_LIST = "repairs";

    @Autowired
    private RepairServiceImpl repairService;

    @Autowired
    private UserServiceImpl userService;



    @GetMapping(path = "/user")
    public String userHome(Model model) {
        Optional<User> user = userService.findById(1L);
        List<Repair> repairs = repairService.findByUser(user.get());
        model.addAttribute(REPAIRS_LIST,repairs);
        return "userhome";
    }

}
