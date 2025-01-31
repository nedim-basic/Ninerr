package ptf.si.ninerr.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ptf.si.ninerr.Models.Application;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByAppUserId(Long appUserId);

}