package pf5.codehub.team5.webapp.mappers;

import org.springframework.stereotype.Component;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.form.RepairForm;

@Component
public class RepairToRepairFormMapper {

    public RepairForm map(Repair repair) {
        RepairForm repairForm = new RepairForm();
        repairForm.setStreet(repair.getStreet());
        repairForm.setStreetNumber(repair.getStreetNumber());
        repairForm.setPostalCode(repair.getPostalCode());
        repairForm.setCity(repair.getCity());
        repairForm.setDateTime(repair.getDateTime().toString());
        repairForm.setDescription(repair.getDescription());
        repairForm.setStatus(repair.getStatus().name());
        repairForm.setCategory(repair.getCategory().name());
        repairForm.setCost(Double.toString(repair.getCost()));
        repairForm.setVat(repair.getUser().getVat());
        repairForm.setId(repair.getId());

        return repairForm;
    }

}
