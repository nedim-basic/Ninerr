package ptf.si.ninerr.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ptf.si.ninerr.Models.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}
