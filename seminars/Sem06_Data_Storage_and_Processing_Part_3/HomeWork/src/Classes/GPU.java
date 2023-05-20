package Classes;

import java.util.Objects;

public class GPU {
    private String manufacture;
    private String model;
    private Double baseClock;
    private Integer maxMemorySize;
    private String memoryType;
    // TODO: 20.05.2023 Добавить стоимость

    public GPU(String manufacture, String model, Double baseClock, Integer maxMemorySize, String memoryType) {
        this.manufacture = manufacture;
        this.model = model;
        this.baseClock = baseClock;
        this.maxMemorySize = maxMemorySize;
        this.memoryType = memoryType;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getBaseClock() {
        return baseClock;
    }

    public void setBaseClock(Double baseClock) {
        this.baseClock = baseClock;
    }

    public Integer getMaxMemorySize() {
        return maxMemorySize;
    }

    public void setMaxMemorySize(Integer maxMemorySize) {
        this.maxMemorySize = maxMemorySize;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof GPU gpu)) return false;
        return Objects.equals(getManufacture(), gpu.getManufacture())
               && Objects.equals(getModel(), gpu.getModel())
               && Objects.equals(getBaseClock(), gpu.getBaseClock())
               && Objects.equals(getMaxMemorySize(), gpu.getMaxMemorySize())
               && Objects.equals(getMemoryType(), gpu.getMemoryType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacture(),
                            getModel(),
                            getBaseClock(),
                            getMaxMemorySize(),
                            getMemoryType()
                            );
    }

    @Override
    public String toString() {
        return String.format("%s %s, %.2f GHz, %d Gb, %s",
                manufacture, model, baseClock, maxMemorySize, memoryType);
    }
}
