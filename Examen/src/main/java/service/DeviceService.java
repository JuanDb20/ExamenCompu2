package service;

import entity.Measurement;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import repository.DeviceRepository;
import repository.MeasurementRepository;
import entity.Device;
public class DeviceService {

    // Dependencia inyectada por Spring (IoC)
    private DeviceRepository repo;

    // Constructor Injection (Dependency Injection)
    public DeviceService(DeviceRepository repo) {
        this.repo = repo;
    }

    // Regla de negocio:
    public void saveDevice(Device device) {

        // Validación antes de guardar
        if (!repo.contains(device)) {
            repo.save(device);
        }

    }


    }











