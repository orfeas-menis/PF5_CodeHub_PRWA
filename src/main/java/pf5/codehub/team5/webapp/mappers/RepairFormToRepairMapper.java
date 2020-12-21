package pf5.codehub.team5.webapp.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.enums.Category;
import pf5.codehub.team5.webapp.enums.Status;
import pf5.codehub.team5.webapp.form.RepairForm;
import pf5.codehub.team5.webapp.repository.UserRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Component
public class RepairFormToRepairMapper {

    @Autowired
    UserRepository userRepository;

    public Repair map(RepairForm repairForm) {
        Repair repair = new Repair();
        repair.setCity(repairForm.getCity());
        repair.setPostalCode(repairForm.getPostalCode());
        repair.setStreet(repairForm.getStreet());
        repair.setStreetNumber(repairForm.getStreetNumber());
        repair.setDateTime(parseLocalDateFromString(repairForm.getDateTime()));
        repair.setDescription(repairForm.getDescription());
        repair.setStatus(Status.valueOf(repairForm.getStatus()));
        repair.setCategory(Category.valueOf(repairForm.getCategory()));
        String myCost = repairForm.getCost().replace(',','.');
        boolean numeric = true;
        Double num = 0.0;
        try {
            num = Double.parseDouble(myCost);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if (numeric) {
            repair.setCost(Math.round(num * 100.0) / 100.0);
        }
        Optional<User> user = userRepository.findByVat(repairForm.getVat());
        if (user.isPresent()) repair.setUser(user.get());
        if (repairForm.getId() != null){
            repair.setId(repairForm.getId());
        }
        return repair;
    }

    private LocalDate parseLocalDateFromString(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //ex: '1939-01-01'
        return LocalDate.parse(date, formatter);
    }
}
