package org.wecancodeit.com.project.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class ContinentModel {

    @Id
    @GeneratedValue
    private Long id;
    private String continentName;
    @Lob
    private String continentMapUrl;
    @OneToMany(mappedBy = "continent")
    private Collection<CountryModel> country;


    public Long getId() {
        return id;
    }

    public String getContinentName() {
        return continentName;
    }

    public Collection<CountryModel> getCountry() {
        return country;
    }

    public String getContinentMapUrl() {
        return continentMapUrl;
    }

    public ContinentModel(String continentName, String continentMapUrl) {
        this.continentName = continentName;
        this.continentMapUrl = continentMapUrl;
    }

    public ContinentModel() {
    }
}
