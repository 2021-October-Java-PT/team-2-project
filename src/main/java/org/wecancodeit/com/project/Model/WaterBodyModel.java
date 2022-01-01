package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

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
