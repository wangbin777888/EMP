package com.tujia.Emp.entity;

import java.util.Date;

public class File {
    private String ID;
    private Date start_date;
    private Date end_date;
    private String description;

    @Override
    public String toString() {
        return "File{" +
                "ID='" + ID + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", description='" + description + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}