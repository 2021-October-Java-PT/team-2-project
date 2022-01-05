package org.wecancodeit.com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {
    @RequestMapping("/about-us")
    public String displayAboutUsPage() {
        return "aboutUs";
    }
}
