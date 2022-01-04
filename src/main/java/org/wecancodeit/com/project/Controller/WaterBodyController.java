package org.wecancodeit.com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.Model.WaterBodyModel;
import org.wecancodeit.com.project.Repo.WaterBodyRepo;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class WaterBodyController {

    @Resource
    private WaterBodyRepo waterBodyRepo;

    @RequestMapping("/water-body")
    public String displayAllBodiesOfWater(Model model) {
        model.addAttribute("waterBodies", waterBodyRepo.findAll());
        return "allWaterBodiesTemplate";
    }

    @RequestMapping("/water-body/{id}")
    public String displaySingleWaterBody(@PathVariable long id, Model model) {
        Optional<WaterBodyModel> retrievedWaterBody = waterBodyRepo.findById(id);
        WaterBodyModel foundWaterBody = retrievedWaterBody.get();
        model.addAttribute("waterBody", foundWaterBody);
        return "waterBodyTemplate";
    }

//      Ask Alan about this. It's pulling the object and passing it as the name in the template, but won't pull from the constructor
//    @GetMapping("/waterBodies/{waterBodyName}")
//    public String displaySingleBodyOfWater(@PathVariable String waterBodyName, Model model) {
//        WaterBodyModel retrievedWaterBody = waterBodyRepository.findWaterBodyModelByWaterBodyName(waterBodyName);
//        model.addAttribute("waterBody", retrievedWaterBody);
//        return "waterBodyTemplate";
//    }
}
