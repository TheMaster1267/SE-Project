package com.cardio_generator.generators;

import com.cardio_generator.outputs.OutputStrategy;
/**
 * Interface representing a generator for patient data.
 * Implementations of this interface are responsible for generating specific types
 * of patient data and outputting them using the provided output strategy.
 */
public interface PatientDataGenerator {
    /**
     * Generates data for a specific patient and outputs it using the specified
     * output strategy.
     *
     * @param patientId the ID of the patient for whom to generate data
     * @param outputStrategy the strategy to use for outputting the generated data
     */
    void generate(int patientId, OutputStrategy outputStrategy);
}
