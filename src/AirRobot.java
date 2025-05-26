import java.time.LocalDate;
import java.time.Year;

public class AirRobot extends Robot implements ResistanceEvaluable {
    private int maxAltitude;
    private int flightAutonomy;

    public AirRobot(String name, Maker maker, Year manufacturingYear, LocalDate registrationDate,
                    int maxAltitude, int flightAutonomy) {
        super(name, maker, manufacturingYear, registrationDate);
        this.maxAltitude = maxAltitude;
        this.flightAutonomy = flightAutonomy;
    }

    public int getFlightAutonomy() {
        return flightAutonomy;
    }

    @Override
    public String getTechnicalDescription() {
        return name + " flies up to " + maxAltitude + " m for " + flightAutonomy +
                " minutes. Manufactured in " + manufacturingYear + " by " + maker + ".";
    }

    @Override
    public boolean isFitForResistance() {
        return flightAutonomy >= 60;
    }
}
