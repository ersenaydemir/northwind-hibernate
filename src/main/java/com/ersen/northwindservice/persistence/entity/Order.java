package com.ersen.northwindservice.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Orders")
public class Order implements Serializable {
    private static final long serialVersionUID = 3454360088733713477L;

    @Id
    @Column(name = "OrderID")
    private int orderId;

    @Column(name = "OrderDate")
    private Date orderDate;

    @Column(name = "RequiredDate")
    private Date requiredDate;

    @Column(name = "ShippedDate")
    private Date shippedDate;

    @Column(name = "Freight")
    private BigDecimal freight;

    @Column(name = "ShipName")
    private String shipName;

    @Column(name = "ShipAddress")
    private String shipAddress;

    @Column(name = "ShipCity")
    private String shipCity;

    @Column(name = "ShipRegion")
    private String shipRegion;

    @Column(name = "ShipPostalCode")
    private String shipPostalCode;

    @Column(name = "ShipCountry")
    private String shipCountry;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order that = (Order) o;
        return orderId == that.orderId && Objects.equals(orderDate, that.orderDate) && Objects.equals(requiredDate, that.requiredDate) && Objects.equals(shippedDate, that.shippedDate) && Objects.equals(freight, that.freight) && Objects.equals(shipName, that.shipName) && Objects.equals(shipAddress, that.shipAddress) && Objects.equals(shipCity, that.shipCity) && Objects.equals(shipRegion, that.shipRegion) && Objects.equals(shipPostalCode, that.shipPostalCode) && Objects.equals(shipCountry, that.shipCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderDate, requiredDate, shippedDate, freight, shipName, shipAddress, shipCity, shipRegion, shipPostalCode, shipCountry);
    }
}
