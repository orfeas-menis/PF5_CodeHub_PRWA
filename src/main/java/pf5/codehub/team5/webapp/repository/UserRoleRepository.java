package pf5.codehub.team5.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pf5.codehub.team5.webapp.domain.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
