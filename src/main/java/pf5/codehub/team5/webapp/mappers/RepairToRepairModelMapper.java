package pf5.codehub.team5.webapp.mappers;

import org.springframework.stereotype.Component;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.model.RepairModel;

@Component
public class RepairToRepairModelMapper {
    public RepairModel map(Repair repair) {
        RepairModel repairModel = new RepairModel();
        repairModel.setCategory(repair.getCategory());
        repairModel.setCity(repair.getCity());
        repairModel.setCost(repair.getCost());
        repairModel.setDateTime(repair.getDateTime().toString());
        repairModel.setDescription(repair.getDescription());
        repairModel.setPostalCode(repair.getPostalCode());
        repairModel.setStatus(repair.getStatus());
        repairModel.setStreet(repair.getStreet());
        repairModel.setStreetNumber(repair.getStreetNumber());
        repairModel.setUserVat(repair.getUser().getVat());
        repairModel.setId(repair.getId());
        return repairModel;
    }
}
