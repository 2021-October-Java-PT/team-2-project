package org.wecancodeit.com.project.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

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

    //    ask alan about this.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WaterBodyModel that = (WaterBodyModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}