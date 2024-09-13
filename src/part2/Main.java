package part2;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        InternationalShip internationalShip = new InternationalShip();
        internationalShip.handleInternationalDocuments();
        internationalShip.handleCustoms();
        internationalShip.loadCargo();
        internationalShip.planRoute();
        internationalShip.startTransport();
        internationalShip.manageHeavyCargo();

        System.out.println();

        RegionalTruck regionalTruck = new RegionalTruck();
        regionalTruck.checkWeatherConditions();
        regionalTruck.planRoute();
        regionalTruck.startTransport();
        regionalTruck.manageFuelUsage();
    }
}
