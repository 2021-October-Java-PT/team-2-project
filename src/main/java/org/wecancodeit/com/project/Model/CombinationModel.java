package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CombinationModel {

    @Id
    @GeneratedValue
    private Long id;
    private ContinentModel continent;
    private CountryModel country;
    private WaterBodyModel bodyOfWater;
    private IslandChainModel islandChain;

    public Long getId() {
        return id;
    }

    public ContinentModel getContinent() {
        return continent;
    }

    public CountryModel getCountry() {
        return country;
    }

    public WaterBodyModel getBodyOfWater() {
        return bodyOfWater;
    }

    public IslandChainModel getIslandChain() {
        return islandChain;
    }


    public CombinationModel(ContinentModel continent, CountryModel country, WaterBodyModel bodyOfWater, IslandChainModel islandChain) {
        this.continent = continent;
        this.country = country;
        this.bodyOfWater = bodyOfWater;
        this.islandChain = islandChain;
    }

    public CombinationModel() {


    }
}
