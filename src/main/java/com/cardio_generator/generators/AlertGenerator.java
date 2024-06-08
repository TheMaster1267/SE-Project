package com.cardio_generator.generators;

import java.util.Random;
import com.cardio_generator.outputs.OutputStrategy;

public class AlertGenerator implements PatientDataGenerator {

    public static final Random RANDOM_GENERATOR = new Random(); // Changed variable name to camelCase
    private boolean[] alertStates; // Changed variable name to camelCase

    public AlertGenerator(int patientCount) {
        alertStates = new boolean[patientCount + 1]; // Changed variable name to camelCase
    }

    @Override
    public void generate(int patientId, OutputStrategy outputStrategy) {
        try {
            if (alertStates[patientId]) { // Changed variable name to camelCase
                if (RANDOM_GENERATOR.nextDouble() < 0.9) { // 90% chance to resolve
                    alertStates[patientId] = false; // Changed variable name to camelCase
                    // Output the alert
                    outputStrategy.output(patientId, System.currentTimeMillis(), "Alert", "resolved");
                }
            } else {
                double lambda = 0.1; // Changed variable name to camelCase
                // Probability of at least one alert in the period
                double probability = -Math.expm1(-lambda); // Changed variable name to camelCase
                boolean alertTriggered = RANDOM_GENERATOR.nextDouble() < probability; // Changed variable name to camelCase

                if (alertTriggered) {
                    alertStates[patientId] = true; // Changed variable name to camelCase
                    // Output the alert
                    outputStrategy.output(patientId, System.currentTimeMillis(), "Alert", "triggered");
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred while generating alert data for patient " + patientId);
            e.printStackTrace();
        }
    }
}
