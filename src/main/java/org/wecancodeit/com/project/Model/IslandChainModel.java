package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class IslandChainModel {

    @Id
    @GeneratedValue
    private Long id;
    private String islandName;

    @ManyToOne
    private CountryModel country;

    @ManyToOne
    private WaterBodyModel bodyOfWater;


    public IslandChainModel(String islandName, CountryModel country, WaterBodyModel bodyOfWater) {
        this.islandName = islandName;
        this.country = country;
        this.bodyOfWater = bodyOfWater;
    }

    public IslandChainModel() {

    }

    public Long getId() {
        return id;
    }

    public String getIslandName() {
        return islandName;
    }

    public CountryModel getCountry() {
        return country;
    }

    public WaterBodyModel getBodyOfWater() {
        return bodyOfWater;
    }

}
