package com.example.placement;

public class model {
    String name,date,branch;


    public model() {

    }

    public model(String name, String date, String branch) {
        this.name = name;
        this.date = date;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
