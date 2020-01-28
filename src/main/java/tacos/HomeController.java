package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    // get mapping assumes that the value returned by the annotated method is the logical name for the corresponding view
    public String home() {
        return "home";
    }

}
