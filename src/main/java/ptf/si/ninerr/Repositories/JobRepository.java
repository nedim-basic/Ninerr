package ptf.si.ninerr.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ptf.si.ninerr.Models.Jobs;

public interface JobRepository extends JpaRepository<Jobs, Long> {
}
