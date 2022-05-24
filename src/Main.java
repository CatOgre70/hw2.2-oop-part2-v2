public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Орлёнок", 2);
        System.out.println("bicycle = " + bicycle);
        bicycle.check();

        Car car = new Car("Лада Калина", 4);
        System.out.println("car = " + car);
        car.check();

        Truck truck = new Truck("Камаз", 6);
        System.out.println("truck = " + truck);
        truck.check();

    }
}