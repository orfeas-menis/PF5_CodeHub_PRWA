package pf5.codehub.team5.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pf5.codehub.team5.webapp.domain.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    Optional<User> findByFirstNameAndLastName(String firstName, String lastName);

    Optional<User> findByEmail(String email);

    Optional<User> findByVat(String vat);

    Optional<User> findById(Long id);

    @Query(value="SELECT a FROM User a JOIN FETCH a.repairs WHERE a.id = (:id)")
    Optional<User> fetchUserWithRepairsByUserId(@Param("id") Long id);
}
