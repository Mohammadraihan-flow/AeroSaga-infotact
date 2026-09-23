package com.aerosaga.telemetry.controller;

import com.aerosaga.telemetry.model.Drone;
import com.aerosaga.telemetry.service.DroneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/drones")
public class DroneController {

    private final DroneService droneService;

    public DroneController(DroneService droneService) {
        this.droneService = droneService;
    }

    @GetMapping("/{droneId}")
    public Drone getDrone(@PathVariable String droneId) {
        return droneService.getDrone(droneId);
    }
}