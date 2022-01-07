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
        PackListModel packList1 = new PackListModel("Tent", "Hiking Backpack", "Summer sleeping bag", "Insect repellent wristband", "Travel hammock");
        packListRepo.save(packList1);

        PackListModel packList2 = new PackListModel("Sunglasses", "Waterproof watch", "Bathing suits", "Raincoat / Poncho", "Comfortable Open Shoes");
        packListRepo.save(packList2);

        PackListModel packList3 = new PackListModel("Sun Hat", "Waterproof Footwear", "Flotation Strap", "Bug repellent", "Sunscreen lotion");
        packListRepo.save(packList3);

        PackListModel packList4 = new PackListModel("Activated Charcoal", "Hand Sanitizer", "Beach Towel", "Sun Tan Lotion", "Offline Map App");
        packListRepo.save(packList4);

        PackListModel packList5 = new PackListModel("Snorkel", "Waterproof Speakers", "Toothbrush Cover", "Waterproof Money Pouch", "Underwater Camera");
        packListRepo.save(packList5);


        // Itinerary
        ItineraryModel bassIslandsItinerary = new ItineraryModel("day1", "day1Activities", "day2", "day2Activities", "day3", "day3Activities");
        itineraryRepo.save(bassIslandsItinerary);

        // Continents
        ContinentModel africa = new ContinentModel("Africa", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#0.95/12.3/-14");
        ContinentModel asia = new ContinentModel("Asia", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.49/37.4/87.3");
        ContinentModel australia = new ContinentModel("Australia", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#2.12/-24.53/133.78");
        ContinentModel europe = new ContinentModel("Europe", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#0.81/-6.6/-65.1");
        ContinentModel northAmerica = new ContinentModel("North America", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#0.96/55.9/-109.8");
        ContinentModel southAmerica = new ContinentModel("South America", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.88/-24.14/-60.39");
        continentRepo.save(africa);
        continentRepo.save(asia);
        continentRepo.save(australia);
        continentRepo.save(europe);
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);


        // Countries
        CountryModel australiaCountry = new CountryModel("Australia", australia, "Australia, officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands. With an area of 7,617,930 square kilometres, Australia is the largest country by area in Oceania and the world's sixth-largest country.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#2.12/-24.53/133.78");
        CountryModel brazil = new CountryModel("Brazil", southAmerica, "Brazil, officially the Federative Republic of Brazil, is the largest country in both South America and Latin America. At 8.5 million square kilometers and with over 211 million people, Brazil is the world's fifth-largest country by area and the sixth most populous.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#2.86/-12.36/-51.84");
        CountryModel canada = new CountryModel("Canada", northAmerica, "Canada is a country in North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering 9.98 million square kilometers, making it the world's second-largest country by total area.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.92/62.25/-104.15");
        CountryModel chile = new CountryModel("Chile", southAmerica, "Chile is a long, narrow country stretching along South America's western edge, with more than 6,000km of Pacific Ocean coastline. Santiago, its capital, sits in a valley surrounded by the Andes and Chilean Coast Range mountains. The city's palm-lined Plaza de Armas contains the neoclassical cathedral and the National History Museum. The massive Parque Metropolitano offers swimming pools, a botanical garden and zoo.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#3.31/-28.18/-69.1");
        CountryModel colombia = new CountryModel("Colombia", southAmerica, "Colombia, officially the Republic of Colombia, is a transcontinental country spanning South America and an insular region in North America.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#3.75/2.69/-72.71");
        CountryModel croatia = new CountryModel("Croatia", europe, "Croatia, officially the Republic of Croatia, is a country at the crossroads of Central and Southeast Europe on the Adriatic Sea.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#3.19/43.84/18.31");
        CountryModel ecuador = new CountryModel("Ecuador", southAmerica, "Ecuador is a country straddling the equator on South America’s west coast. Its diverse landscape encompasses Amazon jungle, Andean highlands and the wildlife-rich Galápagos Islands. In the Andean foothills at an elevation of 2,850m, Quito, the capital, is known for its largely intact Spanish colonial center, with decorated 16th- and 17th-century palaces and religious sites, like the ornate Compañía de Jesús Church.", " https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#4.43/-0.15/-77.89");
        CountryModel greece = new CountryModel("Greece", europe, "Greece is a country in southeastern Europe with thousands of islands throughout the Aegean and Ionian seas. Influential in ancient times, it's often called the cradle of Western civilization. Athens, its capital, retains landmarks including the 5th-century B.C. Acropolis citadel with the Parthenon temple. Greece is also known for its beaches, from the black sands of Santorini to the party resorts of Mykonos. Greece is a country in southeastern Europe with thousands of islands throughout the Aegean and Ionian seas. Influential in ancient times, it's often called the cradle of Western civilization. Athens, its capital, retains landmarks including the 5th-century B.C. Acropolis citadel with the Parthenon temple. Greece is also known for its beaches, from the black sands of Santorini to the party resorts of Mykonos.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#5.62/38.982/22.753");
        CountryModel india = new CountryModel("India", asia, "India, officially the Republic of India, is a country in South Asia. It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#2.96/22.95/80.05");
        CountryModel italy = new CountryModel("Italy", europe, "Italy, a European country with a long Mediterranean coastline, has left a powerful mark on Western culture and cuisine. Its capital, Rome, is home to the Vatican as well as landmark art and ancient ruins. Other major cities include Florence, with Renaissance masterpieces such as Michelangelo’s David and Brunelleschi's Duomo; Venice, the city of canals; and Milan, Italy’s fashion capital.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=false&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=false#4.25/41.28/14.05");
        CountryModel madagascarCountry = new CountryModel("Madagascar", africa, "Madagascar, officially the Republic of Madagascar, and previously known as the Malagasy Republic, is an island country in the Indian Ocean, approximately 400 kilometres off the coast of East Africa across the Mozambique Channel.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#4.61/-19.14/46.74");
        CountryModel philippinesCountry = new CountryModel("Philippines", asia, "For God, People, Nature, and Country", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#4.26/12.04/123.51");
        CountryModel republicOfCaboVerde = new CountryModel("Republic of Cabo Verde", africa, "Cape Verde or Cabo Verde, officially the Republic of Cabo Verde, is an archipelago and island country in the central Atlantic Ocean, consisting of ten volcanic islands with a combined land area of about 4,033 square kilometres.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#3.65/16.94/-25.01");
        CountryModel republicOfSeychelles = new CountryModel("Republic Of Seychelles", africa, "The Seychelles is an archipelago of 115 islands in the Indian Ocean, off East Africa. It's home to numerous beaches, coral reefs and nature reserves, as well as rare animals such as giant Aldabra tortoises. Mahé, a hub for visiting the other islands, is home to capital Victoria. It also has the mountain rainforests of Morne Seychellois National Park and beaches, including Beau Vallon and Anse Takamaka. ", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#4.92/-6.91/52.37");
        CountryModel spain = new CountryModel("Spain", europe, "Spain, a country on Europe’s Iberian Peninsula, includes 17 autonomous regions with diverse geography and cultures. Capital city Madrid is home to the Royal Palace and Prado museum, housing works by European masters. Segovia has a medieval castle (the Alcázar) and an intact Roman aqueduct. Catalonia’s capital, Barcelona, is defined by Antoni Gaudí’s whimsical modernist landmarks like the Sagrada Família church.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#3.5/40.47/-3.49");
        CountryModel tanzania = new CountryModel("Tanzanian", africa, "Tanzania is an East African country known for its vast wilderness areas. They include the plains of Serengeti National Park, a safari mecca populated by the “big five” game (elephant, lion, leopard, buffalo, rhino), and Kilimanjaro National Park, home to Africa’s highest mountain. Offshore lie the tropical islands of Zanzibar, with Arabic influences, and Mafia, with a marine park home to whale sharks and coral reefs.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#3.43/-5.92/33.81");
        CountryModel thailand = new CountryModel("Thailand", asia, "Thailand is a Southeast Asian country. It's known for tropical beaches, opulent royal palaces, ancient ruins and ornate temples displaying figures of Buddha. In Bangkok, the capital, an ultramodern cityscape rises next to quiet canalside communities and the iconic temples of Wat Arun, Wat Pho and the Emerald Buddha Temple (Wat Phra Kaew). Nearby beach resorts include bustling Pattaya and fashionable Hua Hin.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#3.66/14.61/102.17");
        CountryModel uk = new CountryModel("United Kingdom", europe, "The Queen lives here.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.7/55.08/-4.72");
        CountryModel usa = new CountryModel("United States of America", northAmerica, "The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC. Midwestern metropolis Chicago is known for influential architecture and on the west coast, Los Angeles' Hollywood is famed for filmmaking.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#1.83/39.41/-97.13");
        countryRepo.save(australiaCountry);
        countryRepo.save(brazil);
        countryRepo.save(canada);
        countryRepo.save(chile);
        countryRepo.save(colombia);
        countryRepo.save(croatia);
        countryRepo.save(ecuador);
        countryRepo.save(greece);
        countryRepo.save(india);
        countryRepo.save(italy);
        countryRepo.save(madagascarCountry);
        countryRepo.save(philippinesCountry);
        countryRepo.save(republicOfCaboVerde);
        countryRepo.save(republicOfSeychelles);
        countryRepo.save(spain);
        countryRepo.save(tanzania);
        countryRepo.save(thailand);
        countryRepo.save(uk);
        countryRepo.save(usa);


        //Water Bodies
        WaterBodyModel adriaticSea = new WaterBodyModel("Adriatic Sea", "The Adriatic Sea is a body of water separating the Italian Peninsula from the Balkans. The Adriatic is the northernmost arm of the Mediterranean Sea, extending from the Strait of Otranto to the northwest and the Po Valley.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#5.4/42.913/16.022");
        WaterBodyModel aegeanSea = new WaterBodyModel("Aegean Sea", "The Aegean Sea is an elongated embayment of the Mediterranean Sea between Europe and Asia. It is located between the Balkans and Anatolia, and covers an area of some 215,000 square kilometres", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#5.31/38.482/25.269");
        WaterBodyModel andamanSea = new WaterBodyModel("Andaman Sea", "The Andaman Sea is a marginal sea of the northeastern Indian Ocean bounded by the coastlines of Myanmar and Thailand along the Gulf of Martaban and west side of the Malay Peninsula, and separated from the Bay of Bengal to its west by the Andaman Islands and the Nicobar Islands.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#5.35/11.412/95.969");
        WaterBodyModel atlanticOcean = new WaterBodyModel("Atlantic Ocean", "The Atlantic Ocean is the second-largest of the world's five oceans, with an area of about 106,460,000 km². It covers approximately 20% of Earth's surface and about 29% of its water surface area.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#1.24/3/-25.6");
        WaterBodyModel caribbeanSea = new WaterBodyModel("Caribbean", "The Caribbean Islands is a massive archipelago located in the Caribbean Sea, that can be subdivided into a few different regions: the Lucayan Archipelago, the Greater Antilles, the Lesser Antilles and the ABC Islands. There are 13 sovereign states and 17 dependent territories in the Caribbean, and the predominant languages are English, Spanish, French, Dutch and Antillean creole. The Caribbean sprawls across more than 1.06 million square miles and is primarily located between North America and South America.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.2/19.34/-71.64");
        WaterBodyModel gulfOfThailand = new WaterBodyModel("Gulf of Thailand", "The Gulf of Thailand, also known as the Gulf of Siam, is a shallow inlet in the southwestern South China Sea, bounded between the southwestern shores of the Indochinese Peninsula and the northern half of the Malay Peninsula.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#5.42/9.591/101.992");
        WaterBodyModel indianOcean = new WaterBodyModel("Indian Ocean", "The Indian Ocean has been known by its present name since at least 1515 when the Latin form Oceanus Orientalis Indicus (\"Indian Eastern Ocean\") is attested, named for India, which projects into it. It was earlier known as the Eastern Ocean, a term that was still in use during the mid-18th century (see map), as opposed to the Western Ocean (Atlantic) before the Pacific was surmised.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.66/-3.7/74.7");
        WaterBodyModel ionianSea = new WaterBodyModel("Ionian Sea", "The Ionian Sea is an elongated bay of the Mediterranean Sea. It is connected to the Adriatic Sea to the north, and is bounded by Southern Italy, including Calabria, Sicily, and the Salento peninsula to the west, southern Albania to the north, and the west coast of Greece, including the Peloponnese.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#5.43/38.797/19.173");
        WaterBodyModel jintotoloChannel = new WaterBodyModel("Jintotolo Channel", "The Jintotolo Channel is the body of water that connects the Sibuyan Sea with the Visayan Sea. It is located between the Philippine islands of Panay and Masbate, and is an important shipping route to and from the Central Visayas.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#10.98/11.5697/123.2154");
        WaterBodyModel lakeErie = new WaterBodyModel("Lake Erie", "A place where time moves a little slower, loved ones feel a little closer and there's a Great Lake between you and your worries. From island hopping to birdwatching, record-breaking roller coasters to water parks, wineries to dockside dining, plus hidden gems that keep the fun going all year long. However you like to coast – you'll find it here.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#5.49/42.268/-80.862\n");
        WaterBodyModel mediterraneanSea = new WaterBodyModel("Mediterranean Sea", "The Mediterranean Sea is a sea connected to the Atlantic Ocean, surrounded by the Mediterranean Basin and almost completely enclosed by land: on the north by Western and Southern Europe and Anatolia, on the south by North Africa, and on the east by the Levant.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#4.67/34.29/23.75");
        WaterBodyModel pacificOcean = new WaterBodyModel("Pacific Ocean", "The Pacific Ocean is the largest and deepest of Earth's five oceanic divisions. It extends from the Arctic Ocean in the north to the Southern Ocean in the south and is bounded by the continents of Asia and Australia in the west and the Americas in the east.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.12/3.1/-155.5");
        WaterBodyModel sargassoSea = new WaterBodyModel("Sargasso Sea", "The Aegean Sea is an elongated embayment of the Mediterranean Sea between Europe and Asia", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#9/37.78/-122.4241");
        WaterBodyModel southAtlanticOcean = new WaterBodyModel("South Atlantic", "The Atlantic Ocean is the second-largest of the world's five oceans, with an area of about 106,460,000 km². It covers approximately 20% of Earth's surface and about 29% of its water surface area.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#1.42/-27.7/-15.6");
        WaterBodyModel southChinaSea = new WaterBodyModel("South China Sea", "The South China Sea Islands consist of over 250 islands, atolls, cays, shoals, reefs and seamounts in the South China Sea. The islands are mostly low and small, and have few inhabitants. The islands and surrounding seas are subject to overlapping territorial claims by the countries bordering the South China Sea. The South China Sea Islands constitute a distinct tropical moist broadleaf forest terrestrial ecoregion, and the South China Sea Oceanic Islands marine ecoregion.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.01/5.82/113.71");
        WaterBodyModel tyrrhenianSea = new WaterBodyModel("Tyrrhenian Sea", "The Tyrrhenian Sea is part of the Mediterranean Sea off the western coast of Italy. It is named for the Tyrrhenian people identified with the Etruscans of Italy.", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#5.19/39.451/13.06");
        waterBodyRepo.save(adriaticSea);
        waterBodyRepo.save(aegeanSea);
        waterBodyRepo.save(andamanSea);
        waterBodyRepo.save(atlanticOcean);
        waterBodyRepo.save(caribbeanSea);
        waterBodyRepo.save(gulfOfThailand);
        waterBodyRepo.save(indianOcean);
        waterBodyRepo.save(ionianSea);
        waterBodyRepo.save(jintotoloChannel);
        waterBodyRepo.save(lakeErie);
        waterBodyRepo.save(mediterraneanSea);
        waterBodyRepo.save(pacificOcean);
        waterBodyRepo.save(sargassoSea);
        waterBodyRepo.save(southAtlanticOcean);
        waterBodyRepo.save(southChinaSea);
        waterBodyRepo.save(tyrrhenianSea);


        //Island Chains
        IslandChainModel andamanIsland = new IslandChainModel("Andaman Islands", india, indianOcean, bassIslandsItinerary, packList3, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#6.36/11.858/92.75");
        IslandChainModel balearicIsland = new IslandChainModel("Balearic Islands", spain, ionianSea, bassIslandsItinerary, packList1, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#6.18/39.46/2.667");
        IslandChainModel bassIslands = new IslandChainModel("Bass Islands", canada, lakeErie, bassIslandsItinerary, packList4, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#11.38/41.6727/-82.8273");
        IslandChainModel bermudaIsland = new IslandChainModel("Bermuda Islands", uk, atlanticOcean, bassIslandsItinerary, packList2, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#10.03/32.2878/-64.7677");
        IslandChainModel caboVerdeIsland = new IslandChainModel("Cabo Verde", republicOfCaboVerde, atlanticOcean, bassIslandsItinerary, packList5, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#6.47/15.548/-23.935");
        IslandChainModel campanianIsland = new IslandChainModel("Campanian Archipelago", italy, tyrrhenianSea, bassIslandsItinerary, packList3, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#8.68/40.6253/14.1745");
        IslandChainModel capriIsland = new IslandChainModel("Capri", italy, tyrrhenianSea, bassIslandsItinerary, packList3, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#11.11/40.5452/14.2339");
        IslandChainModel chiloeIsland = new IslandChainModel("Chiloe", chile, pacificOcean, bassIslandsItinerary, packList1, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#6.71/-42.658/-73.819");
        IslandChainModel corfuIsland = new IslandChainModel("Corfu", greece, ionianSea, bassIslandsItinerary, packList4, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#8.64/39.6228/19.8716");
        IslandChainModel creteIsland = new IslandChainModel("Crete", greece, aegeanSea, bassIslandsItinerary, packList5, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#6.62/35.173/24.893");
        IslandChainModel formenteraIsland = new IslandChainModel("Formentera", spain, mediterraneanSea, bassIslandsItinerary, packList2, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#10.07/38.7004/1.472");
        IslandChainModel galapagosIslands = new IslandChainModel("Galápagos Islands", ecuador, pacificOcean, bassIslandsItinerary, packList4, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#6.63/0.034/-90.377");
        IslandChainModel hawaiianIsland = new IslandChainModel("Hawaiian Islands", usa, pacificOcean, bassIslandsItinerary, packList3, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#5.55/19.731/-157.586");
        IslandChainModel heardMcDonaldIslands = new IslandChainModel("Heard Island and the McDonald Islands", australiaCountry, indianOcean, bassIslandsItinerary, packList3, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#8.22/-53.066/73.464");
        IslandChainModel hvarIsland = new IslandChainModel("Hvar", croatia, adriaticSea, bassIslandsItinerary, packList5, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#10.22/43.177/16.4478");
        IslandChainModel ibizaIsland = new IslandChainModel("Ibiza", spain, mediterraneanSea, bassIslandsItinerary, packList2, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#7.85/38.934/1.396");
        IslandChainModel iihaGrandeIsland = new IslandChainModel("Iiha Grande", brazil, atlanticOcean, bassIslandsItinerary, packList4, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#9.34/-23.829/-45.3268");
        IslandChainModel ionianIslands = new IslandChainModel("The Ionian Islands", greece, ionianSea, bassIslandsItinerary, packList5, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#7.62/38.056/20.906");
        IslandChainModel ischiaIsland = new IslandChainModel("Ischia", italy, tyrrhenianSea, bassIslandsItinerary, packList1, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#9.73/40.7305/13.9433");
        IslandChainModel islandsOfMadagascar = new IslandChainModel("Islands of Madagascar", madagascarCountry, indianOcean, bassIslandsItinerary, packList2, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#4.63/-19.15/45.99");
        IslandChainModel kauaiIsland = new IslandChainModel("Kauai", usa, pacificOcean, bassIslandsItinerary, packList4, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#8.56/22.0832/-159.515");
        IslandChainModel koSamuiIsland = new IslandChainModel("Koh Samui", thailand, gulfOfThailand, bassIslandsItinerary, packList3, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#9.65/9.4999/100.003");
        IslandChainModel mallorcaIsland = new IslandChainModel("Mallorca", spain, mediterraneanSea, bassIslandsItinerary, packList5, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#7.57/39.536/2.929");
        IslandChainModel mauiIsland = new IslandChainModel("Maui", usa, pacificOcean, bassIslandsItinerary, packList2, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#8.35/20.843/-156.341");
        IslandChainModel oahuIsland = new IslandChainModel("Oahu", usa, pacificOcean, bassIslandsItinerary, packList5, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#8.52/21.5054/-157.9293");
        IslandChainModel philippinesIsland = new IslandChainModel("Philippines", philippinesCountry, southChinaSea, bassIslandsItinerary, packList1, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#3.79/11/122.92");
        IslandChainModel phuketIsland = new IslandChainModel("Phuket", thailand, gulfOfThailand, bassIslandsItinerary, packList2, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#7.51/7.996/98.431");
        IslandChainModel ponzaIsland = new IslandChainModel("Ponza", italy, tyrrhenianSea, bassIslandsItinerary, packList4, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#10.24/40.9038/12.9704");
        IslandChainModel praslinIsland = new IslandChainModel("Praslin Island", republicOfSeychelles, indianOcean, bassIslandsItinerary, packList5, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#4.09/-5.98/50.55");
        IslandChainModel sanAndresIsland = new IslandChainModel("San Andres", colombia, caribbeanSea, bassIslandsItinerary, packList3, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#7.19/12.705/-81.587");
        IslandChainModel santoriniIsland = new IslandChainModel("Santorini Island", greece, aegeanSea, bassIslandsItinerary, packList2, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#10.31/36.3991/25.4243");
        IslandChainModel ungujaIsland = new IslandChainModel("Unguja", tanzania, indianOcean, bassIslandsItinerary, packList4, "SUMMARY_HERE", "https://api.mapbox.com/styles/v1/mbarkley23/cky2c4rxe1pu815nzdmq48ta6.html?title=copy&access_token=pk.eyJ1IjoibWJhcmtsZXkyMyIsImEiOiJja3kyYzIyY2Qwamt4MzN0NWt5N2lhdWswIn0.rxZNbrc8-0SzQlOABDaubQ&zoomwheel=true&fresh=true#10.63/-6.1226/39.3652");
        IslandChainModel seychelles = new IslandChainModel("Seychelles",republicOfSeychelles,indianOcean,bassIslandsItinerary,packList4,"Adventure Summary Coming Soon","https://api.mapbox.com/styles/v1/cstephens/cky2cwav41al814o5n98c52su.html?title=false&access_token=pk.eyJ1IjoiY3N0ZXBoZW5zIiwiYSI6ImNreTJjc2tzYjBqbXQydW1wZ2N0a20zeDYifQ.SkbSfO39uFF6KHu0Jm7ISA&zoomwheel=false#8.45/-4.481/55.582");
        islandChainRepo.save(andamanIsland);
        islandChainRepo.save(balearicIsland);
        islandChainRepo.save(bassIslands);
        islandChainRepo.save(bermudaIsland);
        islandChainRepo.save(caboVerdeIsland);
        islandChainRepo.save(campanianIsland);
        islandChainRepo.save(capriIsland);
        islandChainRepo.save(chiloeIsland);
        islandChainRepo.save(corfuIsland);
        islandChainRepo.save(creteIsland);
        islandChainRepo.save(formenteraIsland);
        islandChainRepo.save(galapagosIslands);
        islandChainRepo.save(hawaiianIsland);
        islandChainRepo.save(heardMcDonaldIslands);
        islandChainRepo.save(hvarIsland);
        islandChainRepo.save(ibizaIsland);
        islandChainRepo.save(iihaGrandeIsland);
        islandChainRepo.save(ionianIslands);
        islandChainRepo.save(ischiaIsland);
        islandChainRepo.save(islandsOfMadagascar);
        islandChainRepo.save(kauaiIsland);
        islandChainRepo.save(koSamuiIsland);
        islandChainRepo.save(mallorcaIsland);
        islandChainRepo.save(mauiIsland);
        islandChainRepo.save(oahuIsland);
        islandChainRepo.save(philippinesIsland);
        islandChainRepo.save(phuketIsland);
        islandChainRepo.save(ponzaIsland);
        islandChainRepo.save(praslinIsland);
        islandChainRepo.save(sanAndresIsland);
        islandChainRepo.save(santoriniIsland);
        islandChainRepo.save(ungujaIsland);
        islandChainRepo.save(seychelles);
    }
}