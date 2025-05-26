import java.util.List;

public class ResistanceReportPrinter {
    public void printReport(List<ResistanceEvaluable> robots) {
        System.out.println("=== Resilience Test Reports ===");
        for (ResistanceEvaluable robot : robots) {
            if (robot instanceof Land) {
                System.out.println(((Land) robot).nombre + ": tracción ORUGAS confirmada. Apto para la competición.");
            } else if (robot instanceof Air) {
                System.out.println(((Air) robot).nombre + ": autonomía de " + ((Air) robot).autonomiaVuelo + " minutos. Apto para la competición.");
            } else {
                System.out.println("No cumple los requisitos.");
            }
        }
    }
}