import java.time.LocalDate;
import java.time.Year;

public class LandRobot extends Robot implements ResistanceEvaluable {
    private TractionType tractionType;
    private int maxSpeed;

    public LandRobot(String name, Maker maker, Year manufacturingYear, LocalDate registrationDate,
                     TractionType tractionType, int maxSpeed) {
        super(name, maker, manufacturingYear, registrationDate);
        this.tractionType = tractionType;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public TractionType getTractionType() {
        return tractionType;
    }

    @Override
    public String getTechnicalDescription() {
        return name + ", manufactured by " + maker +
                " in " + manufacturingYear + ", uses " + tractionType +
                " traction and reaches up to " + maxSpeed + " km/h.";
    }

    @Override
    public boolean isFitForResistance() {
        return tractionType == TractionType.TRACKS;
    }
}
