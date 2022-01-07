package org.wecancodeit.com.project.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class WaterBodyModel {
    @Id
    @GeneratedValue
    private Long id;
    private String waterBodyName;
    @Lob
    private String waterBodyDescription;
    @Lob
    private String waterBodyMapUrl;
    @OneToMany(mappedBy = "waterBody")
    private Collection<IslandChainModel> islandChains;

    public Long getId() {
        return id;
    }

    public String getWaterBodyName() {
        return waterBodyName;
    }

    public String getWaterBodyDescription() {
        return waterBodyDescription;
    }

    public String getWaterBodyMapUrl() {
        return waterBodyMapUrl;
    }

    public Collection<IslandChainModel> getIslandChains() {
        return islandChains;
    }

    public WaterBodyModel(String waterBodyName, String waterBodyDescription, String waterBodyMapUrl) {
        this.waterBodyName = waterBodyName;
        this.waterBodyDescription = waterBodyDescription;
        this.waterBodyMapUrl = waterBodyMapUrl;
    }

    public WaterBodyModel() {
    }
}