package product;

public class Product {

    public static void main(String[] args) {

        ComputerCase computer = new ComputerCase("NZXT", "H510", "Power btn ma gueuelle");
        Monitor monitor = new Monitor("27inch", "LG", 27, "1920x1080");
        Motherboard motherboard = new Motherboard("Asus", "Prime", 4, 2, "v1.0");
        Mouse mouse = new Mouse("Logitech", "G502", 11);
        Keyboard keyboard = new Keyboard("Logitech", "G213", 5);

        PersonalComputer pc = new PersonalComputer("Asus", "Prime", 250, monitor, keyboard, mouse, motherboard, computer);

//        System.out.println(pc.getStorage());
//        pc.getMonitor().drawPixelAt( 1500, 1200, "red");
//        pc.getMotherboard().loadProgram( "Windows 10");

        Product theMonitor = new Monitor("27inch", "LG", 27, "1920x1080");
        System.out.println(theMonitor.manufacturer);
        System.out.println(theMonitor.model);

//        pc.powerUp();
    }


    /**
     * TestProduct TODO a voir avec JUnit
     */
    public class TestProduct {
        public static void main(String[] args) {
            Product[] product = {
                    new Product("27inch", "LG"),
            };
            for (Product e : product) {
                e.model = "27inch";
                if (e instanceof Monitor) ((Monitor) e).drawPixelAt(1500, 1200, "red");
            }
        }
    }


    private String model;
    private String manufacturer;


    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
