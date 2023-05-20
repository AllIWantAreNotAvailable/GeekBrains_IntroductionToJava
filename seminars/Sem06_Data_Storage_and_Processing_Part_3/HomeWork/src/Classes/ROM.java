package Classes;

import java.util.Objects;

public class ROM {
    private Integer density;
    private String driveInterface;
    private String driveType;
    // TODO: 20.05.2023 Добавить стоимость

    public ROM(Integer density, String driveInterface, String driveType) {
        this.density = density;
        this.driveInterface = driveInterface;
        this.driveType = driveType;
    }

    public Integer getDensity() {
        return density;
    }

    public void setDensity(Integer density) {
        this.density = density;
    }

    public String getDriveInterface() {
        return driveInterface;
    }

    public void setDriveInterface(String driveInterface) {
        this.driveInterface = driveInterface;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ROM rom)) return false;
        return Objects.equals(getDensity(), rom.getDensity())
                && Objects.equals(getDriveInterface(), rom.getDriveInterface())
                && Objects.equals(getDriveType(), rom.getDriveType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDensity(),
                            getDriveInterface(),
                            getDriveType()
                            );
    }

    @Override
    public String toString() {
        return String.format("%d Gb (%s, %s)", density, driveType, driveInterface);
    }
}
