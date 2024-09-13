package part2;

public class InternationalShip extends InternationalLogistics implements HeavyCargoTransport {

    @Override
    public void startTransport() {
        System.out.println("Международный корабль начал перевозку.");
    }

    @Override
    public void planRoute() {
        System.out.println("Маршрут для международной морской перевозки спланирован.");
    }

    @Override
    public void handleCustoms() {
        System.out.println("Таможенные документы для международной перевозки обработаны.");
    }

    @Override
    public void manageHeavyCargo() {
        System.out.println("Управление крупногабаритным грузом для морской перевозки.");
    }

    @Override
    void handleInternationalDocuments() {
        System.out.println("Обработка международных транспортных документов.");
    }

    public void loadCargo() {
        System.out.println("Крупногабаритный груз загружен на корабль.");
    }
}
