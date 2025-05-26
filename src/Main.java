public class Main {
    public static void main(String[] args) {
        RobotManager manager = new RobotManager();
        manager.populateRobots();
        manager.listAllTechnicalDescriptions();
        manager.listFastLandRobots(30);
        manager.listByMaker(Maker.AERODYNAM);
        manager.printResistanceReport();
    }
}
