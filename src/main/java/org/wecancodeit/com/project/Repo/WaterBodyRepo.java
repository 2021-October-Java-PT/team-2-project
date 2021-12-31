package org.wecancodeit.com.project.Repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.Model.WaterBodyModel;

public interface WaterBodyRepo extends CrudRepository<WaterBodyModel, Long> {
    Object findBodyOfWaterByLocation(String location);
}
