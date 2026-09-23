package com.aerosaga.telemetry.model;

import java.time.Instant;

public class Drone {

    private String droneId;
    private double latitude;
    private double longitude;
    private double altitude;
    private double battery;
    private double speed;
    private String status;
    private Instant timestamp;

    public Drone() {
    }

    public Drone(
            String droneId,
            double latitude,
            double longitude,
            double altitude,
            double battery,
            double speed,
            String status,
            Instant timestamp) {

        this.droneId = droneId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.battery = battery;
        this.speed = speed;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getDroneId() {
        return droneId;
    }

    public void setDroneId(String droneId) {
        this.droneId = droneId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}