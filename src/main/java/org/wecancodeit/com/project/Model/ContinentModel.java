package org.wecancodeit.com.project.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class ContinentModel {

    @Id
    @GeneratedValue
    private Long id;
    private String continentName;

    @OneToMany(mappedBy = "country")
}
