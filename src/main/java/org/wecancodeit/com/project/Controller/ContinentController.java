package org.wecancodeit.com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.Model.ContinentModel;
import org.wecancodeit.com.project.Repo.ContinentRepo;

import javax.annotation.Resource;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Optional;

//@Controller
public class ContinentController {
//
//    @Resource
//    private ContinentRepo continentRepo;
//
//    @RequestMapping("/continents")
//    public String displayContinents(Model model) {
//        model.addAttribute("continents", continentRepo.findAll());
//        return "continentsTemplate";
//    }
//
//    @RequestMapping("/continents/{id}")
//    public String displaySingleContinent(@PathVariable Long id, Model model) {
//        Optional<ContinentModel> retrievedContinent = continentRepo.findById(id);
//        ContinentModel foundContinent = retrievedContinent.get();
//        model.addAttribute("continent", foundContinent);
//        return "continentTemplate";
//    }
}
