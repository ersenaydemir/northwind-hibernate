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
@Table(name = "Territories")
public class Territory implements Serializable {
    private static final long serialVersionUID = 1643951711525115025L;

    @Id
    @Column(name = "TerritoryID")
    private String territoryId;

    @Column(name = "TerritoryDescription")
    private String territoryDescription;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Territory that = (Territory) o;
        return Objects.equals(territoryId, that.territoryId) && Objects.equals(territoryDescription, that.territoryDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(territoryId, territoryDescription);
    }
}
