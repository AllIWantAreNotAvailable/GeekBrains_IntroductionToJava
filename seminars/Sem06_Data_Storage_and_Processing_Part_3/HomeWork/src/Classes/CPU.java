package Classes;

import java.util.Objects;

public class CPU {
    private String manufacture;
    private String model;
    private Integer totalCores;
    private Integer totalThreats;
    private Double baseClock;
    private Double boostClock;
    // TODO: 20.05.2023 Добавить стоимость

    public CPU(String manufacture, String model, Integer totalCores,
               Integer totalThreats, Double baseClock, Double boostClock) {
        this.manufacture = manufacture;
        this.model = model;
        this.totalCores = totalCores;
        this.totalThreats = totalThreats;
        this.baseClock = baseClock;
        this.boostClock = boostClock;
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

    public Integer getTotalCores() {
        return totalCores;
    }

    public void setTotalCores(Integer totalCores) {
        this.totalCores = totalCores;
    }

    public Integer getTotalThreats() {
        return totalThreats;
    }

    public void setTotalThreats(Integer totalThreats) {
        this.totalThreats = totalThreats;
    }

    public Double getBaseClock() {
        return baseClock;
    }

    public void setBaseClock(Double baseClock) {
        this.baseClock = baseClock;
    }

    public Double getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(Double boostClock) {
        this.boostClock = boostClock;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof CPU cpu)) return false;
        return Objects.equals(getManufacture(), cpu.getManufacture())
                && Objects.equals(getModel(), cpu.getModel())
                && Objects.equals(getTotalCores(), cpu.getTotalCores())
                && Objects.equals(getTotalThreats(), cpu.getTotalThreats())
                && Objects.equals(getBaseClock(), cpu.getBaseClock())
                && Objects.equals(getBoostClock(), cpu.getBoostClock());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacture(),
                            getModel(),
                            getTotalCores(),
                            getTotalThreats(),
                            getBaseClock(),
                            getBoostClock()
                            );
    }

    @Override
    public String toString() {
        return String.format("%s %s %d ядер, %d потоков, %.2f GHz, boost %.2f GHz",
                             manufacture, model, totalCores, totalThreats, baseClock, boostClock);
    }
}
