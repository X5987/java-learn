package burgerFactory;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private String name;
    private double price;
    private String description;
    private String image;
    private String ingredients;
    private String type;
    private String size = "Medium";
    private int calories;
    private List<Topping> topping;


    public Burger(String name, double price, String description, String image, String ingredients,
                  String type, String size, int calories, ArrayList<Topping> topping) {

        System.out.println(topping);
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.ingredients = ingredients;
        this.type = type;
        this.size = size;
        this.calories = calories;
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public List<Topping> getToppingList() {
        return this.topping;
    }

    public void getToppinsListView() {
        for (Topping t : topping) {
            System.out.println(t.getName());
        }
    }

    public double getPrice() {
        return price;
    }

    public double getToppingsPrice() {
        double price = 0;
        for (Topping t : topping) {
            price += t.getPrice();
        }
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", calories='" + calories + '\'' +
                ", topping=" + topping +
                '}';
    }
}
