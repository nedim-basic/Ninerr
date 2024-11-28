package ptf.si.ninerr.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptf.si.ninerr.Repositories.JobRepository;
import ptf.si.ninerr.Models.Jobs;

import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Jobs> getAllJobs() {
        return jobRepository.findAll();
    }

    public void saveJob(Jobs job) {
        jobRepository.save(job);
    }
}
