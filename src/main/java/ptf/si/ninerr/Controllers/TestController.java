package ptf.si.ninerr.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String redirectToStart() {
        return "start"; // Vraća start.html
    }

    @GetMapping("/")
    public String handleRoot() {
        return "start"; // Vraća start.html
    }
}
