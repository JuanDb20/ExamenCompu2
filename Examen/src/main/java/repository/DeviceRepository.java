package repository;

import entity.Device;
import entity.Measurement;
import org.springframework.objenesis.instantiator.android.Android10Instantiator;

import java.util.ArrayList;
import java.util.List;

public class DeviceRepository {
    private ArrayList<Device> devices = new ArrayList<>();

    public void save(Device device) {
        devices.add(device);
    }
    public void initData() {

        Device d1 = new Device();
        Measurement m1 = new Measurement();
        Measurement m2 = new Measurement();

        d1.setId(1);
        d1.setName("Sensor A");
        d1.setMaxValue(6000);
        d1.setMinValue(2000);
        d1.setType("Ph");
        d1.setUnit("C°");

        d1.setSerial("12324sf2");
        d1.setTimeTolerance(200);
        d1.setSamplingPeriod(2000);

        m1.setDeviceId(1);
        m1.setId(100);
        m1.setTimestamp(4000);
        m1.setValue(3900);

        m2.setDeviceId(1);
        m2.setId(101);
        m2.setTimestamp(4000);
        m2.setValue(3950);

        devices.add(d1);


    }

    public boolean contains(Device device) {
        return devices.contains(device);
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    }

