package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class CountryModel {

    @Id
    @GeneratedValue
    private Long id;
    private String countryName;
    private Collection<IslandChainModel>islandChainModels;

}
