package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pf5.codehub.team5.webapp.model.RepairModel;
import pf5.codehub.team5.webapp.service.RepairServiceImpl;

import java.util.List;

@Controller
public class AdminController {

    private static final String REPAIRS_LIST = "repairs";

    @Autowired
    private RepairServiceImpl repairService;

    @GetMapping(path = "/admin")
    public String adminHome(Model model) {
        List<RepairModel> repairs = repairService.findTodayActiveRepairs();
        model.addAttribute(REPAIRS_LIST,repairs);
        return "adminhome";
    }
}
