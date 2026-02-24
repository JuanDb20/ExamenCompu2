package entity;

public class Device {
    private Integer id;
    private String name;
    private String serial;
    private String type;
    private double maxValue;
    private double minValue;
    private long samplingPeriod;
    private long timeTolerance;
    private String unit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public long getSamplingPeriod() {
        return samplingPeriod;
    }

    public void setSamplingPeriod(long samplingPeriod) {
        this.samplingPeriod = samplingPeriod;
    }

    public long getTimeTolerance() {
        return timeTolerance;
    }

    public void setTimeTolerance(long timeTolerance) {
        this.timeTolerance = timeTolerance;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
