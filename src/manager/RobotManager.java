package manager;

import enums.Maker;
import enums.PropulsionType;
import enums.TractionType;
import interfices.ResistanceEvaluable;
import interfices.RobotCompetitor;
import printers.ResistanceReportPrinter;
import robots.AirRobot;
import robots.LandRobot;
import robots.WaterRobot;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RobotManager {
    private List<RobotCompetitor> robots = new ArrayList<>();

    public void populateRobots() {
        robots.add(new LandRobot("Tank", Maker.ROBOCORP, Year.of(2022), LocalDate.now(), TractionType.TRACKS, 40));
        robots.add(new WaterRobot("Aqua", Maker.AQUAMAN, Year.of(2021), LocalDate.now(), 500, PropulsionType.PROPELLER));
        robots.add(new AirRobot("Sky", Maker.AERODYNAM, Year.of(2023), LocalDate.now(), 3000, 90));
    }

    public void listAllTechnicalDescriptions() {
        robots.forEach(robot -> System.out.println(robot.getTechnicalDescription()));
    }

    public void listFastLandRobots(int minSpeed) {
        List<LandRobot> fastRobots = robots.stream()
                .filter(r -> r instanceof LandRobot land && land.getMaxSpeed() > minSpeed)
                .map(r -> (LandRobot) r)
                .toList();

        System.out.println("\nLand robots with speed greater than " + minSpeed + " km/h:");
        fastRobots.forEach(r -> System.out.println(r.getTechnicalDescription()));
    }

    public void listByMaker(Maker maker) {
        List<RobotCompetitor> filtered = robots.stream()
                .filter(r -> r.getMaker() == maker)
                .toList();

        System.out.println("\nRobots by maker " + maker + ":");
        filtered.forEach(r -> System.out.println(r.getTechnicalDescription()));
    }

    public void printResistanceReport() {
        List<ResistanceEvaluable> evaluables = robots.stream()
                .filter(r -> r instanceof ResistanceEvaluable)
                .map(r -> (ResistanceEvaluable) r)
                .collect(Collectors.toList());

        ResistanceReportPrinter printer = new ResistanceReportPrinter();
        printer.printReport(evaluables);
    }
}
