package com.ersen.northwindservice.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employees")
public class Employee implements Serializable {
    private static final long serialVersionUID = -8306486710727163014L;

    @Id
    @Column(name = "EmployeeID")
    private int employeeId;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "Title")
    private String title;

    @Column(name = "TitleOfCourtesy")
    private String titleOfCourtesy;

    @Column(name = "BirthDate")
    private Date birthDate;

    @Column(name = "HireDate")
    private Date hireDate;

    @Column(name = "Address")
    private String address;

    @Column(name = "City")
    private String city;

    @Column(name = "Region")
    private String region;

    @Column(name = "PostalCode")
    private String postalCode;

    @Column(name = "Country")
    private String country;

    @Column(name = "HomePhone")
    private String homePhone;

    @Column(name = "Extension")
    private String extension;

    @Column(name = "Photo")
    private byte[] photo;

    @Column(name = "Notes")
    private String notes;

    @Column(name = "PhotoPath")
    private String photoPath;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return employeeId == that.employeeId && Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName) && Objects.equals(title, that.title) && Objects.equals(titleOfCourtesy, that.titleOfCourtesy) && Objects.equals(birthDate, that.birthDate) && Objects.equals(hireDate, that.hireDate) && Objects.equals(address, that.address) && Objects.equals(city, that.city) && Objects.equals(region, that.region) && Objects.equals(postalCode, that.postalCode) && Objects.equals(country, that.country) && Objects.equals(homePhone, that.homePhone) && Objects.equals(extension, that.extension) && Arrays.equals(photo, that.photo) && Objects.equals(notes, that.notes) && Objects.equals(photoPath, that.photoPath);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(employeeId, lastName, firstName, title, titleOfCourtesy, birthDate, hireDate, address, city, region, postalCode, country, homePhone, extension, notes, photoPath);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }
}
