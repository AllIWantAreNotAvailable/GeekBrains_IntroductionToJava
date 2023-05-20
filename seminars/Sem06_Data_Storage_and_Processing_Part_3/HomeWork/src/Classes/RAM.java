package Classes;

import java.util.Objects;

public class RAM {
    private Integer density;
    private Integer speed;
    private String memoryType;
    // TODO: 20.05.2023 Добавить стоимость

    public RAM(Integer density, Integer speed, String memoryType) {
        this.density = density;
        this.speed = speed;
        this.memoryType = memoryType;
    }

    public Integer getDensity() {
        return density;
    }

    public void setDensity(Integer density) {
        this.density = density;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
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
        if (!(object instanceof RAM ram)) return false;
        return Objects.equals(getDensity(), ram.getDensity())
                && Objects.equals(getSpeed(), ram.getSpeed())
                && Objects.equals(getMemoryType(), ram.getMemoryType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDensity(),
                            getSpeed(),
                            getMemoryType()
                            );
    }

    @Override
    public String toString() {
        return String.format("%d Gb (%d Mbps, %s)", density, speed, memoryType);
    }
}
