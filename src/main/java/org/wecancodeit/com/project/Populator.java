package org.wecancodeit.com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.com.project.Model.ContinentModel;
import org.wecancodeit.com.project.Model.CountryModel;
import org.wecancodeit.com.project.Model.IslandChainModel;
import org.wecancodeit.com.project.Model.WaterBodyModel;
import org.wecancodeit.com.project.Repo.ContinentRepo;
import org.wecancodeit.com.project.Repo.CountryRepo;
import org.wecancodeit.com.project.Repo.IslandChainRepo;
import org.wecancodeit.com.project.Repo.WaterBodyRepo;

import javax.annotation.Resource;

@Component

public class Populator implements CommandLineRunner {

    @Resource
    private ContinentRepo continentRepo;

    @Resource
    private WaterBodyRepo waterBodyRepo;

    @Resource
    private CountryRepo countryRepo;

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
        CountryModel greatBritain = new CountryModel("Great Britain");
        countryRepo.save(greatBritain);

        CountryModel greece = new CountryModel("Greece");
        countryRepo.save(greece);

        CountryModel spain = new CountryModel("Spain");
        countryRepo.save(spain);

        CountryModel italy = new CountryModel("Italy");
        countryRepo.save(italy);

        CountryModel usa = new CountryModel("United States of America");
        countryRepo.save(usa);

        CountryModel thailand = new CountryModel("Thailand");
        countryRepo.save(thailand);

        CountryModel republicOfCaboVerde = new CountryModel("Republic of Cabo Verde");
        countryRepo.save(republicOfCaboVerde);

        CountryModel seychellesRepublic = new CountryModel("Republic of Seychelles");
        countryRepo.save(seychellesRepublic);



        //Water Bodies
        WaterBodyModel caribbean = new WaterBodyModel("Caribbean");
        waterBodyRepo.save(caribbean);

        WaterBodyModel aegeanSea = new WaterBodyModel("Aegean Sea");
        waterBodyRepo.save(aegeanSea);

        WaterBodyModel mediterraneanSea = new WaterBodyModel("Mediterranean Sea");
        waterBodyRepo.save(mediterraneanSea);

        WaterBodyModel tyrrhenianSea = new WaterBodyModel("Tyrrhenian Sea");
        waterBodyRepo.save(tyrrhenianSea);

        WaterBodyModel indianOcean = new WaterBodyModel("Indian Ocean");
        waterBodyRepo.save(indianOcean);

        WaterBodyModel pacificOcean = new WaterBodyModel("Pacific Ocean");
        waterBodyRepo.save(pacificOcean);

        WaterBodyModel atlanticOcean = new WaterBodyModel("Atlantic Ocean");

        WaterBodyModel gulfOfThailand = new WaterBodyModel("Gulf of Thailand");
        waterBodyRepo.save(gulfOfThailand);


        //Island Chains
        IslandChainModel bermuda = new IslandChainModel("Bermuda Islands",greatBritain,aegeanSea);
        islandChainRepo.save(bermuda);

        IslandChainModel santorini = new IslandChainModel("Santorini Island",greece,aegeanSea);
        islandChainRepo.save(santorini);

        IslandChainModel balearicIslands = new IslandChainModel("Balearic Islands", spain, mediterraneanSea);
        islandChainRepo.save(balearicIslands);

        IslandChainModel campanianIslands = new IslandChainModel("Campanian Archipelago",italy,tyrrhenianSea);
        islandChainRepo.save(campanianIslands);

        IslandChainModel hawaiianIslands = new IslandChainModel("Hawaiian Islands",usa,pacificOcean);
        islandChainRepo.save(hawaiianIslands);

        IslandChainModel koSamui = new IslandChainModel("Koh Samui",thailand,gulfOfThailand);
        islandChainRepo.save(koSamui);

        IslandChainModel caboVerde = new IslandChainModel("Cabo Verde",republicOfCaboVerde,atlanticOcean);
        islandChainRepo.save(caboVerde);

        IslandChainModel seychelles = new IslandChainModel("Seychelles Islands", seychellesRepublic,indianOcean);
        islandChainRepo.save(seychelles);



    }
}


