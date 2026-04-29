public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C1", "Warehouse A", 40, 30, 40));

        driver.routeHistory.addCheckpoint(
                new FuelCheckpoint("C2", "Pump 12", 20, 15, 15));

        driver.routeHistory.addCheckpoint(
                new RestCheckpoint("C3", "Motel X", 10, 20, 35));

        driver.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C4", "Client Hub", 50, 25, 40));

        driver.printSummary();
    }
}
