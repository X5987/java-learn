package product;

public class PersonalComputer extends  Product{

    private int storage;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public PersonalComputer(String model, String manufacturer,
                            int storage,
                            Monitor monitor,
                            Keyboard keyboard,
                            Mouse mouse,
                            Motherboard motherboard,
                            ComputerCase computerCase) {
        super(model, manufacturer);
        this.storage = storage;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt( 1500, 1200, "red");
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }


}
