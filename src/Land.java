import java.time.LocalDate;

public class Land extends Robot implements ResistanceEvaluable {
    private String tipoTraccion;
    private int velocidadMaxima;

    public Land(String nombre, String fabricante, int anioFabricacion, LocalDate fechaRegistro, String tipoTraccion, int velocidadMaxima) {
        super(nombre, fabricante, anioFabricacion, fechaRegistro);
        this.tipoTraccion = tipoTraccion;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public String getTechnicalDescription() {
        return nombre + ", fabricado por " + fabricante + " en " + anioFabricacion + ", usa tracción " + tipoTraccion + " y alcanza hasta " + velocidadMaxima + " km/h.";
    }

    @Override
    public boolean esAptoParaResistencia() {
        return "ORUGAS".equalsIgnoreCase(tipoTraccion);
    }

}