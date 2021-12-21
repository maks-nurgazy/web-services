package com.love2code.example.car;

import java.util.Date;

public class Car {
    private String id;
    private String name;
    private String plateNumber;
    private Date year;

    public Car() {
    }

    public Car(String name, String plateNumber, Date year) {
        this.name = name;
        this.plateNumber = plateNumber;
        this.year = year;
    }

    public Car(String id, String name, String plateNumber, Date year) {
        this.id = id;
        this.name = name;
        this.plateNumber = plateNumber;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }
}
