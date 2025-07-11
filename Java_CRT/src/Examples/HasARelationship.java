package Examples;

class Vehicle {

    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void Display () {
        System.out.println("Brand:" + brand);
    }
}

class Bike extends Vehicle {

    private String model;

    public Bike(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Model:" + model);
    }
}

class Car extends Vehicle {

    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Model:" + model);
    }
}

class Honda {
    private Bike bike;
    private Car car;

    public Honda(Bike bike, Car car) {
        this.bike = bike;
        this.car = car;
    }

    public void Display() {
        System.out.println("Examples.Honda Company Details");
        System.out.println("---------------------");
        System.out.println("Examples.Bike Details:");
        bike.Display();
        System.out.println("Examples.Car Details:");
        car.Display();
    }
}

public class HasARelationship {
    public static void main(String[] args) {
        Car hondaCar = new Car("Examples.Honda","City");
        Bike hondaBike = new Bike("Examples.Honda","Hornet");
        Honda honda = new Honda(hondaBike,hondaCar);
        honda.Display();
    }
}