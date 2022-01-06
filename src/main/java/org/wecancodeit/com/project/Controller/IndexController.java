package org.wecancodeit.com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"/home", "/", ""})
    public String displayHomePage() {
        return "index";
    }
}