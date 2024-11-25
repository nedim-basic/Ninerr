package ptf.si.ninerr.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobController {

    @GetMapping("/jobs")
    public String listJobs(Model model) {
        // Dodajte potrebne podatke u model
        return "jobs"; // Prikazuje jobs.html
    }
}
