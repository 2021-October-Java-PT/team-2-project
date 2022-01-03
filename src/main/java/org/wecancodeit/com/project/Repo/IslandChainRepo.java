package org.wecancodeit.com.project.Repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.Model.IslandChainModel;

public interface IslandChainRepo extends CrudRepository<IslandChainModel, Long> {
    IslandChainModel findIslandChainModelByIslandName(String islandName);
}