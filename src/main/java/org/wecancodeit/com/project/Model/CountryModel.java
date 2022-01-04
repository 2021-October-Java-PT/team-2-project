package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class CountryModel {

    @Id
    @GeneratedValue
    private Long id;
    private String countryName;

//    @ManyToOne
//    private ContinentModel continent;

    @OneToMany(mappedBy = "country")
    private Collection<IslandChainModel> islandChains;

    public Long getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }


    public Collection<IslandChainModel> getIslandChains(){
        return islandChains;
    }

    public CountryModel() {
    }

    public CountryModel(String countryName) {
        this.countryName = countryName;
    }
}

