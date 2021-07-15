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
@Table(name = "EmployeeTerritories")
@IdClass(EmployeeTerritoriesPK.class)
public class EmployeeTerritory implements Serializable {
    private static final long serialVersionUID = 3248697678879661683L;

    @Id
    @Column(name = "EmployeeID")
    private int employeeId;

    @Id
    @Column(name = "TerritoryID")
    private String territoryId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTerritory that = (EmployeeTerritory) o;
        return employeeId == that.employeeId && Objects.equals(territoryId, that.territoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, territoryId);
    }
}
