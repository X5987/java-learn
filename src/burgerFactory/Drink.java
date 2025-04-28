package burgerFactory;

public class Drink {

    private String name;
    private double price;
    private String size;
    private String calories;
    private String image;

    public Drink(String name, double price, String size, String calories, String image) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.calories = calories;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getCalories() {
        return calories;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                ", calories='" + calories + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
