import java.time.LocalDate;

public class Air extends Robot implements ResistanceEvaluable {
    private int altitudMaxima;
    private int autonomiaVuelo;

    public Air(String nombre, String fabricante, int anioFabricacion, LocalDate fechaRegistro, int altitudMaxima, int autonomiaVuelo) {
        super(nombre, fabricante, anioFabricacion, fechaRegistro);
        this.altitudMaxima = altitudMaxima;
        this.autonomiaVuelo = autonomiaVuelo;
    }

    @Override
    public String getTechnicalDescription() {
        return nombre + " vuela hasta " + altitudMaxima + " m durante " + autonomiaVuelo + " minutos. Fabricado en " + anioFabricacion + " por " + fabricante + ".";
    }

    public boolean esAptoParaResistencia() {
        return autonomiaVuelo >= 60;
    }
    @Override
    public boolean esAptoParaResistencia() {
        return autonomiaVuelo >= 60;
    }

}