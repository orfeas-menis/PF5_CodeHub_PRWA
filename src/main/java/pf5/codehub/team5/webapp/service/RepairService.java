package pf5.codehub.team5.webapp.service;


import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.model.RepairModel;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface RepairService {
    Optional<RepairModel> findRepair(Long id);
    List<RepairModel> findAll();
    Optional<RepairModel> findByDate(Date date);
    Optional<RepairModel> findByVat(String vat);
    Optional<Repair> fetchUserWithRepairsByUserId(Long id);
}
