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

        // Packing List
        PackListModel bassIslandsPackList = new PackListModel("item1", "item2", "item3", "item4", "item5");
        packListRepo.save(bassIslandsPackList);

        // Itinerary
        ItineraryModel bassIslandsItinerary = new ItineraryModel("day1", "day1Activities", "day2", "day2Activities", "day3", "day3Activities");
        itineraryRepo.save(bassIslandsItinerary);

        // Continents
        ContinentModel asia = new ContinentModel("Asia", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.49/37.4/87.3");
        continentRepo.save(asia);

        ContinentModel africa = new ContinentModel("Africa", "");
        continentRepo.save(africa);

        ContinentModel northAmerica = new ContinentModel("North America", "");
        continentRepo.save(northAmerica);

        ContinentModel southAmerica = new ContinentModel("South America", "");
        continentRepo.save(southAmerica);

        ContinentModel europe = new ContinentModel("Europe", "");
        continentRepo.save(europe);

        ContinentModel australia = new ContinentModel("Australia", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#2.12/-24.53/133.78");
        continentRepo.save(australia);


        // Countries
        CountryModel greece = new CountryModel("Greece", europe, "Greece is a country in southeastern Europe with thousands of islands throughout the Aegean and Ionian seas. Influential in ancient times, it's often called the cradle of Western civilization. Athens, its capital, retains landmarks including the 5th-century B.C. Acropolis citadel with the Parthenon temple. Greece is also known for its beaches, from the black sands of Santorini to the party resorts of Mykonos. Greece is a country in southeastern Europe with thousands of islands throughout the Aegean and Ionian seas. Influential in ancient times, it's often called the cradle of Western civilization. Athens, its capital, retains landmarks including the 5th-century B.C. Acropolis citadel with the Parthenon temple. Greece is also known for its beaches, from the black sands of Santorini to the party resorts of Mykonos.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#5.62/38.982/22.753");
        countryRepo.save(greece);

        CountryModel madagascarCountry = new CountryModel("Madagascar", africa, "Madagascar, officially the Republic of Madagascar, and previously known as the Malagasy Republic, is an island country in the Indian Ocean, approximately 400 kilometres off the coast of East Africa across the Mozambique Channel.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#4.61/-19.14/46.74");
        countryRepo.save(madagascarCountry);

        CountryModel canada = new CountryModel("Canada", northAmerica, "Canada is a country in North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering 9.98 million square kilometers, making it the world's second-largest country by total area.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.92/62.25/-104.15");
        countryRepo.save(canada);

        CountryModel australiaCountry = new CountryModel("Australia", australia, "Australia, officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands. With an area of 7,617,930 square kilometres, Australia is the largest country by area in Oceania and the world's sixth-largest country.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#2.12/-24.53/133.78");
        countryRepo.save(australiaCountry);

        CountryModel india = new CountryModel("India", asia, "India, officially the Republic of India, is a country in South Asia. It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#2.96/22.95/80.05");
        countryRepo.save(india);

        CountryModel ecuador = new CountryModel("Ecuador", southAmerica, "Ecuador is a country straddling the equator on South America’s west coast. Its diverse landscape encompasses Amazon jungle, Andean highlands and the wildlife-rich Galápagos Islands. In the Andean foothills at an elevation of 2,850m, Quito, the capital, is known for its largely intact Spanish colonial center, with decorated 16th- and 17th-century palaces and religious sites, like the ornate Compañía de Jesús Church.", " https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#4.43/-0.15/-77.89");
        countryRepo.save(ecuador);

//        CountryModel uk = new CountryModel("United Kingdom", europe, "The Queen lives here.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.7/55.08/-4.72");
//        countryRepo.save(uk);

//        CountryModel countryPhilippines = new CountryModel("Philippines", asia, "For God, People, Nature, and Country", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#4.26/12.04/123.51");
//        countryRepo.save(countryPhilippines);
//
//        CountryModel spain = new CountryModel("Spain");
//        countryRepo.save(spain);
//
//        CountryModel italy = new CountryModel("Italy");
//        countryRepo.save(italy);
//
//        CountryModel usa = new CountryModel("United States of America");
//        countryRepo.save(usa);
//
//        CountryModel republicOfCaboVerde = new CountryModel("Republic of Cabo Verde");
//        countryRepo.save(republicOfCaboVerde);
//


        //Water Bodies
        WaterBodyModel southAtlanticOcean = new WaterBodyModel("South Atlantic", "The Atlantic Ocean is the second-largest of the world's five oceans, with an area of about 106,460,000 km². It covers approximately 20% of Earth's surface and about 29% of its water surface area.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.42/-27.7/-15.6");
        waterBodyRepo.save(southAtlanticOcean);

        WaterBodyModel lakeErie = new WaterBodyModel("Lake Erie", "A place where time moves a little slower, loved ones feel a little closer and there's a Great Lake between you and your worries. From island hopping to birdwatching, record-breaking roller coasters to water parks, wineries to dockside dining, plus hidden gems that keep the fun going all year long. However you like to coast – you'll find it here.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#5.49/42.268/-80.862\n");
        waterBodyRepo.save(lakeErie);

        WaterBodyModel pacificOcean = new WaterBodyModel("Pacific Ocean", "The Pacific Ocean is the largest and deepest of Earth's five oceanic divisions. It extends from the Arctic Ocean in the north to the Southern Ocean in the south and is bounded by the continents of Asia and Australia in the west and the Americas in the east.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.12/3.1/-155.5");
        waterBodyRepo.save(pacificOcean);

        WaterBodyModel indianOcean = new WaterBodyModel("Indian Ocean", "The Indian Ocean has been known by its present name since at least 1515 when the Latin form Oceanus Orientalis Indicus (\"Indian Eastern Ocean\") is attested, named for India, which projects into it. It was earlier known as the Eastern Ocean, a term that was still in use during the mid-18th century (see map), as opposed to the Western Ocean (Atlantic) before the Pacific was surmised.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.66/-3.7/74.7");
        waterBodyRepo.save(indianOcean);

        WaterBodyModel ionianSea = new WaterBodyModel("Ionian Sea", "The Ionian Sea is an elongated bay of the Mediterranean Sea. It is connected to the Adriatic Sea to the north, and is bounded by Southern Italy, including Calabria, Sicily, and the Salento peninsula to the west, southern Albania to the north, and the west coast of Greece, including the Peloponnese.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#5.43/38.797/19.173");
        waterBodyRepo.save(ionianSea);

//        WaterBodyModel caribbeanSea = new WaterBodyModel("Caribbean", "The Caribbean Islands is a massive archipelago located in the Caribbean Sea, that can be subdivided into a few different regions: the Lucayan Archipelago, the Greater Antilles, the Lesser Antilles and the ABC Islands. There are 13 sovereign states and 17 dependent territories in the Caribbean, and the predominant languages are English, Spanish, French, Dutch and Antillean creole. The Caribbean sprawls across more than 1.06 million square miles and is primarily located between North America and South America.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.2/19.34/-71.64");
//        waterBodyRepo.save(caribbeanSea);
//
//        WaterBodyModel aegeanSea = new WaterBodyModel("Aegean Sea");
//        waterBodyRepo.save(aegeanSea);
//
//        WaterBodyModel ionianSea = new WaterBodyModel("Mediterranean Sea");
//        waterBodyRepo.save(ionianSea);
//
//        WaterBodyModel tyrrhenianSea = new WaterBodyModel("Tyrrhenian Sea");
//        waterBodyRepo.save(tyrrhenianSea);
//
//        WaterBodyModel indianOcean = new WaterBodyModel("Indian Ocean");
//        waterBodyRepo.save(indianOcean);
//
//        WaterBodyModel pacificOcean = new WaterBodyModel("Pacific Ocean");
//        waterBodyRepo.save(pacificOcean);
//
//        WaterBodyModel atlanticOcean = new WaterBodyModel("Atlantic Ocean");
//        waterBodyRepo.save(atlanticOcean);
//
//        WaterBodyModel gulfOfThailand = new WaterBodyModel("Gulf of Thailand");
//        waterBodyRepo.save(gulfOfThailand);
//
//        WaterBodyModel southChinaSea = new WaterBodyModel("South China Sea", "The South China Sea Islands consist of over 250 islands, atolls, cays, shoals, reefs and seamounts in the South China Sea. The islands are mostly low and small, and have few inhabitants. The islands and surrounding seas are subject to overlapping territorial claims by the countries bordering the South China Sea. The South China Sea Islands constitute a distinct tropical moist broadleaf forest terrestrial ecoregion, and the South China Sea Oceanic Islands marine ecoregion.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.01/5.82/113.71");
//        waterBodyRepo.save(southChinaSea);


        //Island Chains
        IslandChainModel bassIslands = new IslandChainModel("Bass Islands", canada, lakeErie, bassIslandsItinerary, bassIslandsPackList);
        islandChainRepo.save(bassIslands);

        IslandChainModel andamanIslands = new IslandChainModel("Andaman Islands", india, indianOcean, bassIslandsItinerary, bassIslandsPackList);
        islandChainRepo.save(andamanIslands);

        IslandChainModel heardMcDonaldIslands = new IslandChainModel("Heard Island and the McDonald Islands", australiaCountry, indianOcean, bassIslandsItinerary, bassIslandsPackList);
        islandChainRepo.save(heardMcDonaldIslands);

        IslandChainModel galapagosIslands = new IslandChainModel("Galápagos Islands", ecuador, pacificOcean, bassIslandsItinerary, bassIslandsPackList);
        islandChainRepo.save(galapagosIslands);

        IslandChainModel madagascar = new IslandChainModel("Madagascar", madagascarCountry, indianOcean, bassIslandsItinerary, bassIslandsPackList);
        islandChainRepo.save(madagascar);

        IslandChainModel ionianIslands = new IslandChainModel("The Ionian Islands", greece, ionianSea, bassIslandsItinerary, bassIslandsPackList);
        islandChainRepo.save(ionianIslands);
//        IslandChainModel bermuda = new IslandChainModel("Bermuda Islands", uk, aegeanSea, bassIslandsItinerary, bassIslandsPackList);
//        islandChainRepo.save(bermuda);
//
//        IslandChainModel santorini = new IslandChainModel("Santorini Island", greece, aegeanSea);
//        islandChainRepo.save(santorini);
//
//        IslandChainModel balearicIslands = new IslandChainModel("Balearic Islands", spain, ionianSea);
//        islandChainRepo.save(balearicIslands);
//
//        IslandChainModel campanianIslands = new IslandChainModel("Campanian Archipelago", italy, tyrrhenianSea);
//        islandChainRepo.save(campanianIslands);
//
//        IslandChainModel hawaiianIslands = new IslandChainModel("Hawaiian Islands", usa, pacificOcean);
//        islandChainRepo.save(hawaiianIslands);
//
//        IslandChainModel koSamui = new IslandChainModel("Koh Samui", thailand, gulfOfThailand);
//        islandChainRepo.save(koSamui);
//
//        IslandChainModel caboVerde = new IslandChainModel("Cabo Verde", republicOfCaboVerde, atlanticOcean);
//        islandChainRepo.save(caboVerde);
//
//        IslandChainModel seychelles = new IslandChainModel("Seychelles Islands", seychellesRepublic, indianOcean);
//        islandChainRepo.save(seychelles);
//
//        IslandChainModel philippines = new IslandChainModel("Philippines", countryPhilippines, southChinaSea, bassIslandsItinerary, bassIslandsPackList);
//        islandChainRepo.save(philippines);
    }
}