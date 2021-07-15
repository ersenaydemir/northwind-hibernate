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
@Table(name = "CustomerDemographics")
public class CustomerDemographic implements Serializable {
    private static final long serialVersionUID = 5898509230903686729L;

    @Id
    @Column(name = "CustomerTypeID")
    private String customerTypeId;

    @Column(name = "CustomerDesc")
    private String customerDesc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDemographic that = (CustomerDemographic) o;
        return Objects.equals(customerTypeId, that.customerTypeId) && Objects.equals(customerDesc, that.customerDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerTypeId, customerDesc);
    }
}
