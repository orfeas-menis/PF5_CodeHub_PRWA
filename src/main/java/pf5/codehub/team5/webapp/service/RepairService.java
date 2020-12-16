package pf5.codehub.team5.webapp.service;


import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.domain.User;
import pf5.codehub.team5.webapp.form.RepairForm;
import pf5.codehub.team5.webapp.model.RepairModel;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface RepairService {
    Optional<RepairModel> findRepair(Long id);
    List<RepairModel> findAll();
    List<RepairModel> findByDateTime(Date date);
    List<RepairModel> findRecentRepairs();
    List<Repair> findByUser(User user);
    RepairModel createRepair(RepairForm repairForm);
}
