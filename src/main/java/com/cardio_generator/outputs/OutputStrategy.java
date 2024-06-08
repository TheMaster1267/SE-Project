package com.cardio_generator.outputs;

/**
 * Interface representing an output strategy for patient data.
 * Implementations of this interface are responsible for outputting patient data
 * in a specific manner.
 */

public interface OutputStrategy {

    /**
     * Outputs data for a specific patient.
     *
     * @param patientId the ID of the patient whose data is being output
     * @param timestamp the time at which the data was generated, in milliseconds since UNIX epoch
     * @param label a label describing the type of data
     * @param data the actual data to be output
     */

    void output(int patientId, long timestamp, String label, String data);
}
