package pf5.codehub.team5.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pf5.codehub.team5.webapp.domain.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    Optional<User> findUserByFirstNameAndLastName(String firstName, String lastName);
//    Optional<User> findUserByEmail(String email);

    List<User> findByEmail(String email);
    @Query(value="SELECT a FROM User a JOIN FETCH a.repairs WHERE a.id = (:id)")
    Optional<User> fetchUserWithRepairsByUserId(@Param("id") Long id);
}
