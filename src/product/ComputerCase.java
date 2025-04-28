package product;

public class ComputerCase extends Product{
    private String  powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Button power On");
    }

    public String getPowerSupply() {
        return powerSupply;
    }
}
