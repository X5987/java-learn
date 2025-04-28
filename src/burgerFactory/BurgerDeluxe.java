package burgerFactory;

import java.util.ArrayList;

public class BurgerDeluxe extends Burger {
    private String name;
    private double price;
    private String description;
    private String image;
    private String type;
    private String size;
    private int calories;



    public BurgerDeluxe(String name, double price, String description, String ingredient, String image, String type,
                        String size, int calories, ArrayList<Topping> topping) {
        super( name, price, description, ingredient, image, type, size, calories, topping);
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.type = type;
        this.size = size;
        this.calories = calories;
    }

    @Override
    public double getPrice() {
        if (super.getToppingList() != null) {
            for (Topping t : super.getToppingList()) {
                price += t.getPrice();
            }
        }
        return super.getPrice() + 2.00; // Adding 2.00 for deluxe burger
    }

    @Override
    public String toString() {
        return "BurgerDeluxe{" +
                "name='" + getName() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}
