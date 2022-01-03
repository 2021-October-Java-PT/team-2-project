package org.wecancodeit.com.project.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class WaterBodyModel {
    @Id
    @GeneratedValue
    private Long id;
    private String waterBodyName;

    @OneToMany(mappedBy = "waterBody")
    private Collection<IslandChainModel> islandChains;

    public Long getId() {
        return id;
    }

    public String getWaterBodyName() {
        return waterBodyName;
    }

    public Collection<IslandChainModel> getIslandChains(){
        return islandChains;
    }

    public WaterBodyModel(String waterBodyName) {
        this.waterBodyName = waterBodyName;
    }

    public WaterBodyModel() {
    }
}