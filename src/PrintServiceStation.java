public interface PrintServiceStation {
    static void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            updateTyre(bicycle);
        }
    }

    static void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            updateTyre(car);
        }
    }

    static void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            updateTyre(truck);
        }
        checkEngine(truck);
        checkTrailer(truck);
    }

    static void updateTyre(Vehicle vehicle) {
        System.out.println("Меняем покрышку");
    }

    static void checkEngine(Vehicle vehicle) {
        System.out.println("Проверяем двигатель");
    }

    static void checkTrailer(Vehicle vehicle) {
        System.out.println("Проверяем прицеп");
    }
}
