package org.wecancodeit.com.project.Model;

import javax.persistence.*;

@Entity
public class IslandChainModel {

    @Id
    @GeneratedValue
    private Long id;
    private String islandName;

    @ManyToOne
    private CountryModel country;

    @ManyToOne
    private WaterBodyModel waterBody;
    @OneToOne
    private ItineraryModel itinerary;
    @ManyToOne
    private PackListModel packList;


    public Long getId() {
        return id;
    }

    public String getIslandName() {
        return islandName;
    }

    public CountryModel getCountry() {
        return country;
    }

    public WaterBodyModel getWaterBody() {
        return waterBody;
    }

    public PackListModel getPackList() {
        return packList;
    }

    public ItineraryModel getItinerary() {
        return itinerary;
    }

    public IslandChainModel(String islandName, CountryModel country, WaterBodyModel waterBody, ItineraryModel itinerary, PackListModel packList) {
        this.islandName = islandName;
        this.country = country;
        this.waterBody = waterBody;
        this.itinerary = itinerary;
        this.packList = packList;
    }

    public IslandChainModel() {
    }
}
