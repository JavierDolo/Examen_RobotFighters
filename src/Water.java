import java.time.LocalDate;

public class Water extends Robot {
    private int profundidadMaxima;
    private String tipoPropulsion;

    public Water(String nombre, String fabricante, int anioFabricacion, LocalDate fechaRegistro, int profundidadMaxima, String tipoPropulsion) {
        super(nombre, fabricante, anioFabricacion, fechaRegistro);
        this.profundidadMaxima = profundidadMaxima;
        this.tipoPropulsion = tipoPropulsion;
    }

    @Override
    public String getTechnicalDescription() {
        return nombre + " alcanza una profundidad de " + profundidadMaxima + " m con propulsión tipo " + tipoPropulsion + ". Fabricado por " + fabricante + " en " + anioFabricacion + ".";
    }
}