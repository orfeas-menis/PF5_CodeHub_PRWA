package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pf5.codehub.team5.webapp.enums.Category;
import pf5.codehub.team5.webapp.enums.Status;
import pf5.codehub.team5.webapp.form.RepairForm;
import pf5.codehub.team5.webapp.model.RepairModel;
import pf5.codehub.team5.webapp.service.RepairServiceImpl;

import javax.validation.Valid;
import java.util.List;

import static pf5.codehub.team5.webapp.utils.GlobalAttributes.ERROR_MESSAGE;

@Controller
public class RepairController {
    private static final String REPAIRS_LIST = "repairs";
    private static final String REPAIR_FORM= "repairForm";
    private static final String CATEGORIES= "categories";
    private static final String STATUSES= "statuses";

    @Autowired
    private RepairServiceImpl repairService;

    @GetMapping(path = "/repair")
    public String repairHome(Model model) {
        List<RepairModel> repairs = repairService.findFirst10();
        model.addAttribute(REPAIRS_LIST,repairs);

        return "repair";
    }

    @GetMapping( "/repair/create")
    public String repairCreateGet(Model model) {
        model.addAttribute(REPAIR_FORM, new RepairForm());
        model.addAttribute(CATEGORIES, Category.values());
        model.addAttribute(STATUSES, Status.values());

        return "repairCreate";
    }

    @PostMapping(value = "/repair/create")
    public String createRepairsPost(Model model, @Valid @ModelAttribute(REPAIR_FORM) RepairForm repairForm,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "repairCreate";
        }
        repairService.createRepair(repairForm);
        return "redirect:/repair";
    }

//    @InitBinder(REPAIR_FORM)
//    protected void initBinder(final WebDataBinder binder) {
//        binder.addValidators(repairCreateValidator);
//    }

//    @PostMapping("/owner/create")
//    public String ownerCreate(Model model,
//                              @Valid @ModelAttribute(USER_FORM) UserForm userForm,
//                              BindingResult bindingResult,
//                              RedirectAttributes redirectAttributes){
//        if (bindingResult.hasErrors()) {
//            //have some error handling here, perhaps add extra error messages to the model
//            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
//            return "ownerCreate";
//        }
//        UserModel userModel = userService.createUser(userForm);
////        redirectAttributes.addAttribute("id", userModel.getId());
//        //we can display the created user if we take the response from createUser and put it as an attribute
//        //we have to also make frontend validation
//        //we have to see what happens with password
//        return "redirect:/owner";
//    }
}
