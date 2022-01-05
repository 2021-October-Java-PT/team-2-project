package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class ContinentModel {

    @Id
    @GeneratedValue
    private Long id;
    private String continentName;

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

    public ContinentModel() {
    }

    public ContinentModel(String continentName) {
        this.continentName = continentName;
    }
}
