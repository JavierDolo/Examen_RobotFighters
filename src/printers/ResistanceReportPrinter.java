package printers;

import interfices.ResistanceEvaluable;
import robots.AirRobot;
import robots.LandRobot;

import java.util.List;

public class ResistanceReportPrinter {
    public void printReport(List<ResistanceEvaluable> robots) {
        System.out.println("=== Resistance Test Reports ===");
        for (ResistanceEvaluable robot : robots) {
            if (robot instanceof LandRobot land) {
                System.out.println(land.getName() + ": traction " + land.getTractionType() +
                        " confirmed. Fit for competition.");
            } else if (robot instanceof AirRobot air) {
                System.out.println(air.getName() + ": flight autonomy of "
                        + air.getFlightAutonomy() + " minutes. Fit for competition.");
            } else {
                System.out.println("Does not meet the requirements.");
            }
        }
    }
}
