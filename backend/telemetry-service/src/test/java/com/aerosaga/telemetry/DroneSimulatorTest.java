package com.aerosaga.telemetry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.aerosaga.telemetry.model.Telemetry;
import com.aerosaga.telemetry.simulator.DroneSimulator;

class DroneSimulatorTest {

    @Test
    void shouldGenerateChangingTelemetry() {

        DroneSimulator simulator = new DroneSimulator("DRONE-001");

        Telemetry first = simulator.generateTelemetry();
        Telemetry second = simulator.generateTelemetry();

        assertEquals("DRONE-001", first.getDroneId());

        assertTrue(second.getLatitude() > first.getLatitude());
        assertTrue(second.getLongitude() > first.getLongitude());
        assertTrue(second.getAltitude() > first.getAltitude());
        assertTrue(second.getBattery() < first.getBattery());
    }
}