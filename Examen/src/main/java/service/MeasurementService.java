package service;

import entity.Measurement;
import repository.MeasurementRepository;
import entity.Device;
import java.util.List;

public class MeasurementService {

    private MeasurementRepository repo;

    // inyección por constructor
    public MeasurementService(MeasurementRepository repo) {
        this.repo = repo;
    }


    public List<Measurement> getAllStudents() {
        return repo.findAll();
    }



    public void saveMeasurement(Measurement m, Device device) {
        if (m.getValue() < device.getMaxValue() || m.getValue() > device.getMinValue()) {
            repo.save(m);


        }

    }
}
