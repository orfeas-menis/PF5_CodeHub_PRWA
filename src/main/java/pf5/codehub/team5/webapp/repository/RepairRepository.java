package pf5.codehub.team5.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.domain.User;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Long> {

    Optional<Repair> findByDateTime(Date date);

    Optional<Repair> findById(Long id);

//    @Query(value="SELECT a FROM User a JOIN FETCH a.repairs WHERE a.id = (:id)")
//    Optional<Repair> fetchUserWithRepairsByUserId(@Param("id") Long id);
//
//    @Query(value="SELECT a FROM User a JOIN FETCH a.repairs WHERE a.vat = (:vat)")
//    Optional<Repair> fetchUserWithRepairsByUserVat(@Param("vat") Long vat);

    @Query(value="SELECT TOP 2 * FROM Repair ORDER BY date_time DESC", nativeQuery = true)
    List<Repair> findRecentRepairs();

    List<Repair> findByUser(User user);
}
