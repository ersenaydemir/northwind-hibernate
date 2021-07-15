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
public class CustomerCustomerDemoPK implements Serializable {
    private static final long serialVersionUID = 8775865934214218382L;

    @Id
    @Column(name = "CustomerID")
    private String customerId;

    @Id
    @Column(name = "CustomerTypeID")
    private String customerTypeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerCustomerDemoPK that = (CustomerCustomerDemoPK) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(customerTypeId, that.customerTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerTypeId);
    }
}
