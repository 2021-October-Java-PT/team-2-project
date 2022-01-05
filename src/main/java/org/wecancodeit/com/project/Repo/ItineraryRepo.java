package org.wecancodeit.com.project.Repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.Model.ItineraryModel;

public interface ItineraryRepo extends CrudRepository<ItineraryModel, Long> {
}
