package pf5.codehub.team5.webapp.service;


import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.form.RepairForm;
import pf5.codehub.team5.webapp.form.UserForm;
import pf5.codehub.team5.webapp.model.RepairModel;
import pf5.codehub.team5.webapp.model.UserModel;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface RepairService {
    Optional<RepairModel> findById(Long id);
    List<RepairModel> findAll();
    List<RepairModel> findFirst10();
    List<RepairModel> findByDateTime(Date date);
    List<RepairModel> findTodayActiveRepairs();
    List<Repair> findByUser(User user);
    RepairModel createRepair(RepairForm repairForm);
    RepairModel updateRepair(RepairForm repairForm);

}
