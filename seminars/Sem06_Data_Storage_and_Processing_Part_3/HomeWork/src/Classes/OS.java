package Classes;

import java.util.Objects;

public class OS {
    private String manufacture;
    private String osName;
    // TODO: 20.05.2023 Добавить стоимость

    public OS(String manufacture, String osName) {
        this.manufacture = manufacture;
        this.osName = osName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof OS os)) return false;
        return Objects.equals(getManufacture(), os.getManufacture())
                && Objects.equals(getOsName(), os.getOsName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacture(),
                getOsName());
    }

    @Override
    public String toString() {
        return String.format("%s %s", manufacture, osName);
    }
}
