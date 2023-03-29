package com.example.fxcoursework;

import javafx.beans.property.SimpleStringProperty;

public class CardioDocs {
    private SimpleStringProperty doctorName, day, time;

    public CardioDocs(String doctorName, String day, String time){
        this.doctorName = new SimpleStringProperty(doctorName);
        this.day = new SimpleStringProperty(day);
        this.time = new SimpleStringProperty(time);
    }

    public String getDoctorName(){
        return doctorName.get();
    }

    public void setDoctorName(SimpleStringProperty doctorName){
        this.doctorName = doctorName;
    }

    public String getDay(){
        return day.get();
    }

    public void setDay(SimpleStringProperty day){
        this.day = day;
    }

    public String getTime(){
        return time.get();
    }

    public void setTime(SimpleStringProperty time){
        this.time = time;
    }



}
