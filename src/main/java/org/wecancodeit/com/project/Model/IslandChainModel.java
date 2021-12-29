package org.wecancodeit.com.project.Model;

import org.springframework.http.StreamingHttpOutputMessage;

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
    private CountryModel country;
    @ManyToOne
    private BodyOfWaterModel bodyOfWater;


    public IslandChainModel(String islandName, CountryModel country, BodyOfWaterModel bodyOfWater){
        this.islandName = islandName;
        this.country = country;
        this.bodyOfWater = bodyOfWater;
    }

    public IslandChainModel(){

    }

    public Long getId(){
        return id;
    }

    public String getIslandName(){
        return islandName;
    }

    public CountryModel getCountry(){
        return country;
    }

    public BodyOfWaterModel getBodyOfWater(){
        return bodyOfWater;
    }

}
