package com.aerosaga.telemetry.simulator;

import java.time.Instant;

import com.aerosaga.telemetry.model.Telemetry;

public class DroneSimulator {

    private final String droneId;

    private double latitude;
    private double longitude;
    private double altitude;
    private double battery;
    private double speed;

    public DroneSimulator(String droneId) {
        this.droneId = droneId;

        this.latitude = 16.7050;
        this.longitude = 74.2433;
        this.altitude = 120.0;
        this.battery = 100.0;
        this.speed = 35.0;
    }

    public Telemetry generateTelemetry() {

        latitude += 0.0001;
        longitude += 0.0001;

        altitude += 1.0;

        battery -= 0.1;

        speed = 35.0;

        return new Telemetry(
                droneId,
                latitude,
                longitude,
                altitude,
                battery,
                speed,
                Instant.now()
        );
    }
}