package robots;

import enums.Maker;
import enums.PropulsionType;

import java.time.LocalDate;
import java.time.Year;

public class WaterRobot extends Robot {
    private int maxDepth;
    private PropulsionType propulsionType;

    public WaterRobot(String name, Maker maker, Year manufacturingYear, LocalDate registrationDate,
                      int maxDepth, PropulsionType propulsionType) {
        super(name, maker, manufacturingYear, registrationDate);
        this.maxDepth = maxDepth;
        this.propulsionType = propulsionType;
    }

    @Override
    public String getTechnicalDescription() {
        return name + " reaches a depth of " + maxDepth + " m with "
                + propulsionType + " propulsion. Manufactured by " + maker
                + " in " + manufacturingYear + ".";
    }

    public PropulsionType getPropulsionType() {
        return propulsionType;
    }
}
