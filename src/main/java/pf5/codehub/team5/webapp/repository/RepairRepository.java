package pf5.codehub.team5.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pf5.codehub.team5.webapp.domain.Repair;


public interface RepairRepository extends JpaRepository<Repair, Long> {
}
