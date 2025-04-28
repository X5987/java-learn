package product;

public class Motherboard extends Product {
    private int cpu;
    private int ram;
    private String storage;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int cpu, int ram, String storage) {
        super(model, manufacturer);
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void loadProgram(String OS){
        System.out.println( "Program " + OS + " is now loading...");
    }
}
