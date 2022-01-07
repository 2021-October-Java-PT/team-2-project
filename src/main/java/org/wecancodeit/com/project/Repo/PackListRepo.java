package org.wecancodeit.com.project.Repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.Model.PackListModel;

public interface PackListRepo extends CrudRepository<PackListModel, Long> {
}
