package product;

public class Keyboard extends Product{

    private int numberOfKeys;

    public Keyboard(String model, String manufacturer, int numberOfKeys) {
        super(model, manufacturer);
        this.numberOfKeys = numberOfKeys;
    }

    public void type() {
        System.out.println("Keyboard type");
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
