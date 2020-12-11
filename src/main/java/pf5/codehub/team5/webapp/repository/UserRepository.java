package pf5.codehub.team5.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pf5.codehub.team5.webapp.domain.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findAuthorByFirstNameAndLastName(String firstName, String lastName);
    Optional<User> findAuthorByEmail(String email);

    @Query(value="SELECT a FROM User a JOIN FETCH a.repairs WHERE a.id = (:id)")
    Optional<User> fetchUserWithRepairsByUserId(@Param("id") Long id);
}
