package pf5.codehub.team5.webapp.mappers;

import org.springframework.stereotype.Component;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.enums.Category;
import pf5.codehub.team5.webapp.enums.Status;
import pf5.codehub.team5.webapp.form.RepairForm;

@Component
public class RepairFormToRepairMapper {


    public Repair map(RepairForm repairForm) {
        Repair repair = new Repair();
        repair.setCity(repairForm.getCity());
        repair.setPostalCode(repairForm.getPostalCode());
        repair.setStreet(repairForm.getStreet());
        repair.setStreetNumber(repairForm.getStreetNumber());
        repair.setDateTime(repairForm.getDateTime());
        repair.setDescription(repairForm.getDescription());
        repair.setStatus(Status.valueOf(repairForm.getStatus()));
        repair.setCategory(Category.valueOf(repairForm.getCategory()));
        repair.setCost(repairForm.getCost());
        repair.setUser(repairForm.getUser());

        return repair;
    }

}
