package pf5.codehub.team5.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.domain.User;

import java.util.Date;
import java.util.Optional;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Long> {
    Optional<Repair> findByDate(Date date);

    Optional<User> findByVat(String vat);

    @Query(value="SELECT a FROM User a JOIN FETCH a.repairs WHERE a.id = (:id)")
    Optional<Repair> fetchUserWithRepairsByUserId(@Param("id") Long id);
}
