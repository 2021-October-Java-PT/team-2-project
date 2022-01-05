package org.wecancodeit.com.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class PackListModel {

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "packList")
    private Collection<IslandChainModel> islandChains;
    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String item5;

    public Long getId() {
        return id;
    }

    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getItem3() {
        return item3;
    }

    public String getItem4() {
        return item4;
    }

    public String getItem5() {
        return item5;
    }

    public Collection<IslandChainModel> getIslandChains() {
        return islandChains;
    }

    public PackListModel(String item1, String item2, String item3, String item4, String item5) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
    }

    public PackListModel() {
    }
}
