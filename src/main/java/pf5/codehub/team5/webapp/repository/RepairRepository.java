package pf5.codehub.team5.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pf5.codehub.team5.webapp.domain.Repair;
import pf5.codehub.team5.webapp.domain.User;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Long> {

    List<Repair> findByDateTime(LocalDate date);

    Optional<Repair> findById(Long id);

    /* findRecentRepairs() and findTop10ByOrderByDateTimeDesc() perform (or at least should perform) the same task */
    @Query(value = "SELECT TOP 10 * FROM Repair ORDER BY date_time DESC", nativeQuery = true)
    List<Repair> findRecentRepairs();

    List<Repair> findTop10ByOrderByDateTimeDesc();

    List<Repair> findTop10ByDateTimeOrderByDateTime(LocalDate Date);

    List<Repair> findFirst10ByOrderByIdDesc();

    List<Repair> findByUser(User user);
}
