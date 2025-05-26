
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

    public class Main {
        public static void main(String[] args) {
            List<RobotCompetitor> robots = new ArrayList<>();
            robots.add(new Land("Tank", "RoboCorp", 2022, LocalDate.now(), "ORUGAS", 40));
            robots.add(new Water("Aqua", "AquaMan", 2021, LocalDate.now(), 500, "HÉLICE"));
            robots.add(new Air("Sky", "AeroDynam", 2023, LocalDate.now(), 3000, 90));

            // Listar todos los robots con su descripción técnica
            robots.forEach(robot -> System.out.println(robot.getTechnicalDescription()));

            // Filtrar robots terrestres con velocidad mayor a X km/h
            int velocidadMinima = 30;
            List<Land> rapidos = robots.stream()
                    .filter(r -> r instanceof Land && ( ((Land) r).getVelocidadMaxima()) > velocidadMinima)
                    .map(r -> (Land) r)
                    .toList();

            System.out.println("\nRobots terrestres con velocidad mayor a " + velocidadMinima + " km/h:");
            rapidos.forEach(r -> System.out.println(r.getTechnicalDescription()));

            // Buscar robots por fabricante
            String fabricanteBuscado = "AeroDynam";
            List<RobotCompetitor> filtradosPorFabricante = robots.stream()
                    .filter(r -> r.getFabricante().equalsIgnoreCase(fabricanteBuscado))
                    .toList();

            System.out.println("\nRobots del fabricante " + fabricanteBuscado + ":");
            filtradosPorFabricante.forEach(r -> System.out.println(r.getTechnicalDescription()));

            // Generar informe de resistencia
            List<ResistanceEvaluable> evaluables = robots.stream()
                    .filter(r -> r instanceof ResistanceEvaluable)
                    .map(r -> (ResistanceEvaluable) r)
                    .collect(Collectors.toList());

            ResistanceReportPrinter printer = new ResistanceReportPrinter();
            printer.printReport(evaluables);
        }
    }


