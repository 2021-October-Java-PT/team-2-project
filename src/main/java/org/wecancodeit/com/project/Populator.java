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
    private WaterBodyRepo waterBodyRepository;

    @Resource
    private IslandChainRepo islandChainRepo;

    @Override
    public void run(String... args) throws Exception {

        WaterBodyModel caribbean = new WaterBodyModel("Caribbean");
        waterBodyRepository.save(caribbean);

//        IslandChainModel bermuda = new IslandChainModel("Bermuda");
//        islandChainRepo.save(bermuda);
    }
}

