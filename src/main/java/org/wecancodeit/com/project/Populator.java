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
import org.wecancodeit.com.project.Model.*;
import org.wecancodeit.com.project.Repo.*;

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
    private WaterBodyRepo waterBodyRepo;

    @Resource
    private IslandChainRepo islandChainRepo;

    @Resource
    private ItineraryRepo itineraryRepo;

    @Resource
    private PackListRepo packListRepo;

    @Override
    public void run(String... args) throws Exception {

        PackListModel bassIslandsPackList = new PackListModel("item1", "item2", "item3", "item4", "item5");
        packListRepo.save(bassIslandsPackList);

//        Itinerary
        ItineraryModel bassIslandsItinerary = new ItineraryModel("day1", "day1Activities", "day2", "day2Activities", "day3", "day3Activities");
        itineraryRepo.save(bassIslandsItinerary);

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



        CountryModel unitedKingdom = new CountryModel("United Kingdom", "The Queen lives here.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.7/55.08/-4.72");
        CountryModel canada = new CountryModel("Canada", "The North Remembers.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.92/62.25/-104.15");
        CountryModel countryPhilippines = new CountryModel("Philippines", "For God, People, Nature, and Country", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#4.26/12.04/123.51");
        countryRepo.save(unitedKingdom);
        countryRepo.save(canada);
        countryRepo.save(countryPhilippines);

        //Water Bodies
        WaterBodyModel caribbean = new WaterBodyModel("Caribbean", "The Caribbean Islands is a massive archipelago located in the Caribbean Sea, that can be subdivided into a few different regions: the Lucayan Archipelago, the Greater Antilles, the Lesser Antilles and the ABC Islands. There are 13 sovereign states and 17 dependent territories in the Caribbean, and the predominant languages are English, Spanish, French, Dutch and Antillean creole. The Caribbean sprawls across more than 1.06 million square miles and is primarily located between North America and South America.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.2/19.34/-71.64");
        WaterBodyModel southChinaSea = new WaterBodyModel("South China Sea", "The South China Sea Islands consist of over 250 islands, atolls, cays, shoals, reefs and seamounts in the South China Sea. The islands are mostly low and small, and have few inhabitants. The islands and surrounding seas are subject to overlapping territorial claims by the countries bordering the South China Sea. The South China Sea Islands constitute a distinct tropical moist broadleaf forest terrestrial ecoregion, and the South China Sea Oceanic Islands marine ecoregion.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.01/5.82/113.71");
        WaterBodyModel lakeErie = new WaterBodyModel("Lake Erie", "A place where time moves a little slower, loved ones feel a little closer and there's a Great Lake between you and your worries. From island hopping to birdwatching, record-breaking roller coasters to water parks, wineries to dockside dining, plus hidden gems that keep the fun going all year long. However you like to coast – you'll find it here.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#5.49/42.268/-80.862\n");
        waterBodyRepo.save(caribbean);
        waterBodyRepo.save(lakeErie);
        waterBodyRepo.save(southChinaSea);

        //Island Chains
        IslandChainModel bermuda = new IslandChainModel("Bermuda", unitedKingdom, caribbean, bassIslandsItinerary, bassIslandsPackList);
        IslandChainModel bassIsland = new IslandChainModel("Bass Island", canada, lakeErie, bassIslandsItinerary, bassIslandsPackList);
        IslandChainModel philippines = new IslandChainModel("Philippines", countryPhilippines, southChinaSea, bassIslandsItinerary, bassIslandsPackList);
        islandChainRepo.save(bermuda);
        islandChainRepo.save(bassIsland);
        islandChainRepo.save(philippines);
    }
}