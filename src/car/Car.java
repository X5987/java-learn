package car;

public abstract class Car {
    private final String description;

    public Car(String description) {
        this.description = description;
    }

     static void Engine(String description) {
        System.out.println("Engine started " + description);
    }

    public abstract void startEngine();
    public abstract void drive();
    protected abstract void runEngine();

    public String getDescription() {
        return description;
    }
}

class GasPoweredCar extends Car {
    private final double avgKmPerLitre;
    private final int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas engine started");
    }

    @Override
    public void drive() {
        System.out.println("Gas car is driving");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas engine is running with %d cylinders and %.1f km/l%n", cylinders, avgKmPerLitre);
    }
}

class ElectricCar extends Car {
    private final double avgKmPerCharge;
    private final int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric engine started");
    }

    @Override
    public void drive() {
        System.out.println("Electric car is driving");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric engine is running with battery size %d kWh and %.1f km/charge%n", batterySize, avgKmPerCharge);
    }
}

class HybridCar extends Car {
    private final double avgKmPerLitre;
    private final int batterySize;
    private final int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid engine started");
        runEngine();
    }

    @Override
    public void drive() {
        System.out.println("Hybrid car is driving");

    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid engine is running with battery size %d kWh, %.1f km/l, and %d cylinders%n", batterySize, avgKmPerLitre, cylinders);
        drive();
    }
}

class CarDemo {
    public static void main(String[] args) {

        Car hybride = new HybridCar( "Gas Car", 15.0, 50, 4);
        hybride.startEngine();
        HybridCar.Engine("Tesla model");

        Car gasCar = new GasPoweredCar( "Gas Carssss", 15.0, 4);
        gasCar.startEngine();
        GasPoweredCar.Engine("Honda model");
    }
}