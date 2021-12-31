package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BodyOfWaterModel {
    @Id
    @GeneratedValue
    private Long id;
    private String bodyOfWaterName;

    public Long getId() {
        return id;
    }

    public String getBodyOfWaterName() {
        return bodyOfWaterName;
    }

    public BodyOfWaterModel(String bodyOfWaterName) {
        this.bodyOfWaterName = bodyOfWaterName;
    }

    public BodyOfWaterModel() {
    }

}
