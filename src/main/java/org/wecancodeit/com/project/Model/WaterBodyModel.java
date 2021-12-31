package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WaterBodyModel {
    @Id
    @GeneratedValue
    private Long id;
    private String waterBodyName;

    public Long getId() {
        return id;
    }

    public String getWaterBodyName() {
        return waterBodyName;
    }

    public WaterBodyModel(String waterBodyName) {
        this.waterBodyName = waterBodyName;
    }

    public WaterBodyModel() {
    }

} 
