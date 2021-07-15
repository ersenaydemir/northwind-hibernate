package com.ersen.northwindservice.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Region")
public class Region implements Serializable {
    private static final long serialVersionUID = 7850349653030467263L;

    @Id
    @Column(name = "RegionID", nullable = false)
    private int regionId;

    @Column(name = "RegionDescription", nullable = false, length = 50)
    private String regionDescription;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region that = (Region) o;
        return regionId == that.regionId && Objects.equals(regionDescription, that.regionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, regionDescription);
    }
}
