package com.example.hotelprofitcalculator;

// Class for Salary
public class Salary {
    private String salaryId;
    private String date;
    private String name;
    private String type;

    // Constructor
    public Salary(String salaryId, String date, String name, String type) {
        this.salaryId = salaryId;
        this.date = date;
        this.name = name;
        this.type = type;
    }

    // Getters and setters
    public String getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(String salaryId) {
        this.salaryId = salaryId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

