package ptf.si.ninerr.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ptf.si.ninerr.Models.AppUser;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}
