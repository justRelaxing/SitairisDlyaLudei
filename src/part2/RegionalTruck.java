package part2;

public class RegionalTruck extends RegionalTransport implements Transport {

    @Override
    public void startTransport() {
        System.out.println("Региональный грузовик начал перевозку.");
    }

    @Override
    public void planRoute() {
        System.out.println("Маршрут для региональной перевозки спланирован.");
    }

    @Override
    void checkWeatherConditions() {
        System.out.println("Проверка погодных условий для региональной перевозки.");
    }

    // Дополнительный метод для учета специфики региональных перевозок
    public void manageFuelUsage() {
        System.out.println("Управление расходом топлива для региональной перевозки.");
    }
}
