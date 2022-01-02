package org.wecancodeit.com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.Model.WaterBodyModel;
import org.wecancodeit.com.project.Repo.WaterBodyRepo;

import javax.annotation.Resource;
import java.util.Collections;

@Controller
public class WaterBodyController {

    @Resource
    private WaterBodyRepo waterBodyRepository;

    @RequestMapping("/waterBodies")
    private String displayAllBodiesOfWater(Model model) {
        model.addAttribute("waterBodies", waterBodyRepository.findAll());
        return "allWaterBodiesTemplate";
    }

//    @GetMapping("/waterBodies/{id}")
//    public String displaySingleBodyOfWater(@PathVariable Long id, Model model) {
//        WaterBodyModel retrievedWaterBody = (WaterBodyModel) waterBodyRepository.findAllById(Collections.singleton(id));
//        model.addAttribute("waterBody", retrievedWaterBody);
//        return "waterBodyTemplate";
//    }

    @GetMapping("/waterBodies/{waterBodyName}")
    public String displaySingleBodyOfWater(@PathVariable String waterBodyName, Model model) {
        WaterBodyModel retrievedWaterBody = (WaterBodyModel) waterBodyRepository.findWaterBodyModelByWaterBodyName(waterBodyName);
        model.addAttribute("waterBody", retrievedWaterBody);
        return "waterBodyTemplate";
    }
}