package ptf.si.ninerr.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TestController {



    @GetMapping("/")
    public String start() {
        return "Index";
    }

    @GetMapping("/jobs")
    public String test() {
        return "jobs";
    }

}
