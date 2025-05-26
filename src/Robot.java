import java.time.LocalDate;

public abstract class Robot implements RobotCompetitor {
    protected String nombre;
    protected String fabricante;
    protected int anioFabricacion;
    protected LocalDate fechaRegistro;

    public Robot(String nombre, String fabricante, int anioFabricacion, LocalDate fechaRegistro) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.anioFabricacion = anioFabricacion;
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}