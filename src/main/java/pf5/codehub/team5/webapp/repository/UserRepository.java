package pf5.codehub.team5.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pf5.codehub.team5.webapp.domain.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
