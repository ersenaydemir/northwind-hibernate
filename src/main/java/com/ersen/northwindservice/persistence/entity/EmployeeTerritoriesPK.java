package com.ersen.northwindservice.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTerritoriesPK implements Serializable {
    private static final long serialVersionUID = -5234187008705927015L;

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
        EmployeeTerritoriesPK that = (EmployeeTerritoriesPK) o;
        return employeeId == that.employeeId && Objects.equals(territoryId, that.territoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, territoryId);
    }
}
