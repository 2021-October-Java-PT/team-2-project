package org.wecancodeit.com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.Model.ContinentModel;
import org.wecancodeit.com.project.Model.CountryModel;
import org.wecancodeit.com.project.Repo.CountryRepo;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class CountryController {

    @Resource
    private CountryRepo countryRepo;


    @RequestMapping("countrys")
    public String displayCountrys(Model model){
        model.addAttribute("countrys", countryRepo.findAll());
        return "countrysTemplate";
    }

    @RequestMapping("/countrys/{id}")
    public String displaySingleCountry(@PathVariable Long id, Model model) {
        Optional<CountryModel> retrievedCountry = countryRepo.findById(id);
        CountryModel foundCountry = retrievedCountry.get();
        model.addAttribute("continent", foundCountry);
        return "countryTemplate";
    }
}
