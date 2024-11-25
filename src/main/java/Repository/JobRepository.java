package ptf.si.ninerr.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptf.si.ninerr.Models.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
