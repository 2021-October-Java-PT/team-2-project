package org.wecancodeit.com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.com.project.Model.WaterBodyModel;
import org.wecancodeit.com.project.Repo.WaterBodyRepo;

import javax.annotation.Resource;

@Component

public class Populator implements CommandLineRunner {

    @Resource
    private WaterBodyRepo waterBodyRepository;

    @Override
    public void run(String... args) throws Exception {

        WaterBodyModel caribbean = new WaterBodyModel("Caribbean");
        waterBodyRepository.save(caribbean);
    }
}


