package pf5.codehub.team5.webapp.mappers;

import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.model.RepairModel;


public class RepairToRepairModelMapper {
    public RepairModel map(Repair repair) {
        RepairModel repairModel = new RepairModel();
        repairModel.setCategory(repair.getCategory());
        repairModel.setCity(repair.getCity());
        repairModel.setCost(repair.getCost());
        repairModel.setDateTime(repair.getDateTime());
        repairModel.setDescription(repair.getDescription());
        repairModel.setPostalCode(repair.getPostalCode());
        repairModel.setStatus(repair.getStatus());
        repairModel.setStreet(repair.getStreet());
        repairModel.setStreetNumber(repair.getStreetNumber());
        return repairModel;
    }
}
