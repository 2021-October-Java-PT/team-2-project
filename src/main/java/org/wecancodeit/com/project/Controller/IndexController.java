package org.wecancodeit.com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.Model.IslandChainModel;
import org.wecancodeit.com.project.Repo.IslandChainRepo;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class IndexController {

    @Resource
    private IslandChainRepo islandChainRepo;

    @RequestMapping({"/home", "/", ""})
    public String displayHomePage() {
        return "index";
    }
}
