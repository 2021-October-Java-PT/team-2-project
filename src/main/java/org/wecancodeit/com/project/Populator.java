package org.wecancodeit.com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.com.project.Model.ContinentModel;
import org.wecancodeit.com.project.Model.IslandChainModel;
import org.wecancodeit.com.project.Model.WaterBodyModel;
import org.wecancodeit.com.project.Repo.ContinentRepo;
import org.wecancodeit.com.project.Repo.IslandChainRepo;
import org.wecancodeit.com.project.Repo.WaterBodyRepo;

import javax.annotation.Resource;

@Component

public class Populator implements CommandLineRunner {

    @Resource
    private ContinentRepo continentRepo;

    @Resource
    private WaterBodyRepo waterBodyRepository;

    @Resource
    private IslandChainRepo islandChainRepo;

    @Override
    public void run(String... args) throws Exception {

        //Continents
        ContinentModel asia = new ContinentModel("Asia");
        continentRepo.save(asia);

        ContinentModel africa = new ContinentModel("Africa");
        continentRepo.save(africa);

        ContinentModel northAmerica = new ContinentModel("North America");
        continentRepo.save(northAmerica);

        ContinentModel southAmerica = new ContinentModel("South America");
        continentRepo.save(southAmerica);

        ContinentModel europe = new ContinentModel("Europe");
        continentRepo.save(europe);

        ContinentModel australia = new ContinentModel("Australia");
        continentRepo.save(australia);

        //Countries


        //Water Bodies
        WaterBodyModel caribbean = new WaterBodyModel("Caribbean");
        waterBodyRepository.save(caribbean);


        //Island Chains
//        IslandChainModel bermuda = new IslandChainModel("Bermuda");
//        islandChainRepo.save(bermuda);
    }
}


