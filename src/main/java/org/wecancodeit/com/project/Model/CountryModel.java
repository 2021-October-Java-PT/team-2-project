package org.wecancodeit.com.project.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class CountryModel {

    @Id
    @GeneratedValue
    private Long id;
    private String countryName;
    @Lob
    private String countryDescription;
    @Lob
    private String countryMapUrl;

    @ManyToOne
    private ContinentModel continent;

    @OneToMany(mappedBy = "country")
    private Collection<IslandChainModel> islandChains;


    public Long getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryDescription() {
        return countryDescription;
    }

    public String getCountryMapUrl() {
        return countryMapUrl;
    }

    public Collection<IslandChainModel> getIslandChains() {
        return islandChains;
    }

    public ContinentModel getContinent() {
        return continent;
    }

    public CountryModel() {
    }

    public CountryModel(String countryName, String countryDescription, String countryMapUrl) {
        this.countryName = countryName;
        this.countryDescription = countryDescription;
        this.countryMapUrl = countryMapUrl;
    }
}

