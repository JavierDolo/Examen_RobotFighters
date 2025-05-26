import java.time.LocalDate;
import java.time.Year;

public abstract class Robot implements RobotCompetitor {
    protected String name;
    protected Maker maker;
    protected Year manufacturingYear;
    protected LocalDate registrationDate;

    public Robot(String name, Maker maker, Year manufacturingYear, LocalDate registrationDate) {
        this.name = name;
        this.maker = maker;
        this.manufacturingYear = manufacturingYear;
        this.registrationDate = registrationDate;
    }

    @Override
    public Maker getMaker() {
        return maker;
    }
}
