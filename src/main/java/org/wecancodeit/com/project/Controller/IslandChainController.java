package org.wecancodeit.com.project.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.Model.IslandChainModel;
import org.wecancodeit.com.project.Model.WaterBodyModel;
import org.wecancodeit.com.project.Repo.IslandChainRepo;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class IslandChainController {

    @Resource
    private IslandChainRepo islandChainRepo;

    @RequestMapping("/island-chains")
    public String displayIslandChains(Model model) {
        model.addAttribute("islandChains", islandChainRepo.findAll());
        model.addAttribute("island-chains", islandChainRepo.findAll());
        return "allIslandChainsTemplate";
    }

    @RequestMapping("/island-chains/{id}")
    public String displaySingleIslandChain(@PathVariable long id, Model model) {
        Optional<IslandChainModel> retrievedIslandChain = islandChainRepo.findById(id);
        IslandChainModel foundIslandChain = retrievedIslandChain.get();
        model.addAttribute("islandChain", foundIslandChain);
        return "islandChainTemplate";
    }
}
