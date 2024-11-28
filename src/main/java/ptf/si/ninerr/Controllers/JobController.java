package ptf.si.ninerr.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ptf.si.ninerr.Models.Jobs;
import ptf.si.ninerr.Repositories.JobRepository;

@Controller
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping("/add-job")
    public String showAddJobForm(Model model) {
        model.addAttribute("job", new Jobs());
        return "addJob"; // Ovo odgovara HTML datoteci `addJob.html`
    }

    @PostMapping("/save-job")
    public String saveJob(@ModelAttribute("job") Jobs job) {
        jobRepository.save(job); // Spremanje u bazu podataka
        return "redirect:/jobs"; // Preusmjeravanje na stranicu s listom poslova
    }
}
