package product;

public class Mouse extends Product{

    private int numberOfButtons;

    public Mouse(String model, String manufacturer, int numberOfButtons) {
        super(model, manufacturer);
        this.numberOfButtons = numberOfButtons;
    }

    public void click() {
        System.out.println("Mouse click");
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }
}
