package pf5.codehub.team5.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pf5.codehub.team5.webapp.enums.Category;
import pf5.codehub.team5.webapp.enums.PropertyType;
import pf5.codehub.team5.webapp.enums.Status;
import pf5.codehub.team5.webapp.enums.UserRole;
import pf5.codehub.team5.webapp.form.RepairForm;
import pf5.codehub.team5.webapp.form.UserForm;
import pf5.codehub.team5.webapp.model.RepairModel;
import pf5.codehub.team5.webapp.model.UserModel;
import pf5.codehub.team5.webapp.service.RepairService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static pf5.codehub.team5.webapp.utils.GlobalAttributes.ERROR_MESSAGE;

@Controller
public class RepairController {
    private static final String REPAIRS_LIST = "repairs";
    private static final String REPAIR_FORM = "repairForm";
    private static final String CATEGORIES = "categories";
    private static final String STATUSES = "statuses";
    private static final String REPAIR = "repair";
    private static final String VAT = "vat";
    private static final String EDIT_FORM = "editForm";


    @Autowired
    private RepairService repairService;

    @PostMapping(path = "/admin/repair/search-vat")
    public String searchPostVat(Model model, @RequestParam String parameter) {
        List<RepairModel> repairs = repairService.findByVat(parameter);

        model.addAttribute(REPAIRS_LIST, repairs);

        return "repair";
    }

    @PostMapping(path = "/admin/repair/search-date")
    public String searchPostDate(Model model, @RequestParam String dateTime) {
        List<RepairModel> repairs = repairService.findByDateTime(dateTime);

        model.addAttribute(REPAIRS_LIST, repairs);

        return "repair";
    }

//        @InitBinder(REPAIR_FORM)
//    protected void initBinder(final WebDataBinder binder) {
//        binder.addValidators(repairCreateValidator);
//    }

//    @InitBinder(EDIT_FORM)
//    protected void initBinderEdit(final WebDataBinder binder) {
//        binder.addValidators(repairEditValidator);
//    }

    @GetMapping(path = "/admin/repair")
    public String repairHome(Model model) {
        List<RepairModel> repairs = repairService.findFirst10();
        model.addAttribute(REPAIRS_LIST, repairs);

        return "repair";
    }

    @GetMapping("/admin/repair/create")
    public String repairCreateGet(Model model) {
        model.addAttribute(REPAIR_FORM, new RepairForm());
        model.addAttribute(CATEGORIES, Category.values());
        model.addAttribute(STATUSES, Status.values());
        return "repairCreate";
    }

    @PostMapping(value = "/admin/repair/create")
    public String repairCreate(Model model,
                               @Valid @ModelAttribute(REPAIR_FORM) RepairForm repairForm,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "repairCreate";
        }
        RepairModel repairModel = repairService.createRepair(repairForm);
        return "redirect:/admin/repair";
    }

    @GetMapping("/admin/repair/{id}/edit")
    public String editRepair(@PathVariable Long id, Model model) {
        Optional<RepairModel> optModel = repairService.findById(id);
        if (optModel.isPresent()) {
            RepairModel repairModel = optModel.get();
            model.addAttribute(REPAIR, repairModel);
            model.addAttribute(VAT, repairModel.getUserVat());
            model.addAttribute(CATEGORIES, Category.values());
            model.addAttribute(STATUSES, Status.values());
        } else {
            model.addAttribute(ERROR_MESSAGE, "user does not exist");
            return "redirect:/admin/repair";
        }
        return "repair_edit";
    }

    @PostMapping(value = "/admin/repair/edit")
    public String editUser(Model model,
                           @Valid @ModelAttribute(EDIT_FORM) RepairForm repairForm,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "validation errors occurred");
            if (repairForm.getId() != null) {
                return "redirect:/admin/repair/" + repairForm.getId().toString() + "/edit";
            } else {
                return "redirect:/admin/repair";
            }
        }
        RepairModel repairModel = repairService.updateRepair(repairForm);
        return "redirect:/admin/repair";
    }

    @PostMapping("/admin/repair/{id}/delete")
    public String deleteRepair(@PathVariable Long id) {
        String response = repairService.deleteById(id);
        return "redirect:/admin/repair";
    }
}
