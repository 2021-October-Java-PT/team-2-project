package org.wecancodeit.com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.Model.WaterBodyModel;
import org.wecancodeit.com.project.Repo.WaterBodyRepo;

import javax.annotation.Resource;

@Controller
public class WaterBodyController {

    @Resource
    private WaterBodyRepo waterBodyRepository;

    @RequestMapping("/waterBodies")
    private String displayAllBodiesOfWater(Model model) {
        model.addAttribute("waterBodies", waterBodyRepository.findAll());
        return "allWaterBodiesTemplate";
    }

    @GetMapping("/waterBodies/{location}")
    public String displaySingleBodyOfWater(@PathVariable String location, Model model) {
        WaterBodyModel retrievedWaterBody = (WaterBodyModel) waterBodyRepository.findBodyOfWaterByLocation(location);
        model.addAttribute("waterBody", retrievedWaterBody);
        return "waterBodyTemplate";
    }
}
