package com.aerosaga.telemetry.service;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.aerosaga.telemetry.model.Drone;

@Service
public class DroneService {

    public Drone getDrone(String droneId) {

        return new Drone(
                droneId,
                16.7050,
                74.2433,
                120.0,
                87.0,
                35.0,
                "ONLINE",
                Instant.now()
        );
    }
}