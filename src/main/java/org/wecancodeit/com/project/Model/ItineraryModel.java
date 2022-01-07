package org.wecancodeit.com.project.Model;

import javax.persistence.*;

@Entity
public class ItineraryModel {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private IslandChainModel islandChain;
    private String day1;
    @Lob
    private String day1Activities;
    private String day2;
    @Lob
    private String day2Activities;
    private String day3;
    @Lob
    private String day3Activities;

    public Long getId() {
        return id;
    }

    public String getDay1() {
        return day1;
    }

    public String getDay1Activities() {
        return day1Activities;
    }

    public String getDay2() {
        return day2;
    }

    public String getDay2Activities() {
        return day2Activities;
    }

    public String getDay3() {
        return day3;
    }

    public String getDay3Activities() {
        return day3Activities;
    }

    public IslandChainModel getIslandChain() {
        return islandChain;
    }

    public ItineraryModel(String day1, String day1Activities, String day2, String day2Activities, String day3, String day3Activities) {
        this.day1 = day1;
        this.day1Activities = day1Activities;
        this.day2 = day2;
        this.day2Activities = day2Activities;
        this.day3 = day3;
        this.day3Activities = day3Activities;
    }

    public ItineraryModel() {
    }
}
