package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.domain.UserRole;
import pf5.codehub.team5.webapp.repository.UserRepository;

@RestController
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping({"/", "/home"})
    public String hello() {

        for (User user : userRepository.findAll()) {
            for (UserRole userRole : user.getUserRole()) {
                System.out.println(userRole.getName()+user.getFirstName());
            }
        }

        return null;
    }


}
