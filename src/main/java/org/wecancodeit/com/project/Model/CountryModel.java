package org.wecancodeit.com.project.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class CountryModel {

    @Id
    @GeneratedValue
    private Long id;
    private String countryName;

    @ManyToOne
    private ContinentModel continent;

    public Long getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public CountryModel() {
    }

    public CountryModel(String countryName) {
        this.countryName = countryName;
    }
}
