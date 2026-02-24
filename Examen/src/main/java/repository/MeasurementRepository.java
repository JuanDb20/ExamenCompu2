package repository;

import entity.Device;
import entity.Measurement;

import java.util.ArrayList;
import java.util.List;

public class MeasurementRepository {

    private List<Measurement> measurements = new ArrayList<>();

    // Dependency Injection:
    // repository depende de otro repository
    private DeviceRepository deviceRepository;

    public MeasurementRepository(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<Measurement> findAll() {
        return measurements;
    }

    public void save(Measurement measurement) {

        measurements.add(measurement);


    }
}
