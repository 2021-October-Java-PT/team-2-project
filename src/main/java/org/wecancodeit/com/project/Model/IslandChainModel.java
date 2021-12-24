package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IslandChainModel {

    @Id
    @GeneratedValue
    private Long id;
    private String islandName;
    private CountryModel country;
    private BodyOfWaterModel bodyOfWater;


}
