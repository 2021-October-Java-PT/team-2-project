package org.wecancodeit.com.project.Repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.Model.CountryModel;

public interface CountryRepo extends CrudRepository<CountryModel, Long> {
}
