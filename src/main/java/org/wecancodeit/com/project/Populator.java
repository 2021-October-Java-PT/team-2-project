package org.wecancodeit.com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.com.project.Model.IslandChainModel;
import org.wecancodeit.com.project.Model.WaterBodyModel;
import org.wecancodeit.com.project.Repo.IslandChainRepo;
import org.wecancodeit.com.project.Repo.WaterBodyRepo;

import javax.annotation.Resource;

@Component

public class Populator implements CommandLineRunner {

    @Resource
    private WaterBodyRepo waterBodyRepo;

    @Resource
    private IslandChainRepo islandChainRepo;

    @Override
    public void run(String... args) throws Exception {

        WaterBodyModel caribbean = new WaterBodyModel("Caribbean", "The Caribbean Islands is a massive archipelago located in the Caribbean Sea, that can be subdivided into a few different regions: the Lucayan Archipelago, the Greater Antilles, the Lesser Antilles and the ABC Islands. There are 13 sovereign states and 17 dependent territories in the Caribbean, and the predominant languages are English, Spanish, French, Dutch and Antillean creole. The Caribbean sprawls across more than 1.06 million square miles and is primarily located between North America and South America.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.2/19.34/-71.64");
        WaterBodyModel southChinaSea = new WaterBodyModel("South China Sea", "The South China Sea Islands consist of over 250 islands, atolls, cays, shoals, reefs and seamounts in the South China Sea. The islands are mostly low and small, and have few inhabitants. The islands and surrounding seas are subject to overlapping territorial claims by the countries bordering the South China Sea. The South China Sea Islands constitute a distinct tropical moist broadleaf forest terrestrial ecoregion, and the South China Sea Oceanic Islands marine ecoregion.", "https://api.mapbox.com/styles/v1/missmadisonrose/ckxpgq7sq0iqt14piwva3j92k.html?title=false&access_token=pk.eyJ1IjoibWlzc21hZGlzb25yb3NlIiwiYSI6ImNreHBmd2JpZjd0ZGwydXEzMTZrMThjcXQifQ.Ubq6kw0wIFtQMKZunE0gyg&zoomwheel=false#3.01/5.82/113.71");
        waterBodyRepo.save(caribbean);
        waterBodyRepo.save(southChinaSea);

//        Madison's test island chains
//        IslandChainModel bermuda = new IslandChainModel("Bermuda", caribbean);
//        IslandChainModel jamaica = new IslandChainModel("Jamaica", caribbean);
//        IslandChainModel phillippines = new IslandChainModel("Phillippines", southChinaSea);
//        islandChainRepo.save(bermuda);
//        islandChainRepo.save(jamaica);
//        islandChainRepo.save(phillippines);
    }
}

