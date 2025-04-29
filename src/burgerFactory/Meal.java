package burgerFactory;

import java.util.ArrayList;

public class Meal {
    public static void main(String[] args) {
//        Meal meal = new Meal();
//        System.out.println(meal.burger.getName());
//        System.out.println(meal.dessert.getName());
//        System.out.println(meal.drink.getName());
//        meal.burger.getToppinsListView();
//        System.out.println("A payer : " + meal.getAllPrice() + "€");




        ArrayList<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Tomato", 0.99, "A tomato"));
        toppings.add(new Topping("Lettuce", 0.99, "A lettuce"));
        toppings.add(new Topping("Onion", 0.99, "An onion"));
        Meal meal2 = new Meal();
        meal2.burger = new Burger("Veggie Burger", 10, "A delicious veggie burger with lettuce and tomato",
                "veggieburger.jpg", "Vegetarian", "Medium", "Small", 300, toppings);
        meal2.drink = new Drink("Orange Juice", 10, "Small", "100", "orangejuice.jpg");
        meal2.dessert = new Dessert("Fruit Salad", 2.99, "A fresh fruit salad", "fruitsalad.jpg");
        System.out.println(meal2.burger.getName());
        System.out.println("A payer : " + meal2.getAllPrice() + "€");
    }

    private Burger burger;
    private Drink drink;
    private Dessert dessert;

    public Meal(Burger burger) {
        this.burger = burger;
    }


    public Meal() {
        ArrayList<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Tomato", 0.20, "A tomato"));
        toppings.add(new Topping("Lettuce", 0.99, "A lettuce"));
        toppings.add(new Topping("Onion", 0.60, "An onion"));

        this.burger = new Burger("Cheeseburger", 5.99, "A delicious cheeseburger with lettuce and tomato",
                "cheeseburger.jpg", "Beef, Cheese, Lettuce, Tomato", "Beef", "Medium", 500, toppings);
        this.drink = new Drink("CocaCola", 2.99, "Medium", "200", "cocacola.jpg");
        this.dessert = new Dessert("Chocolate Cake", 3.99, "A rich chocolate cake", "chocolatecake.jpg");
    }

    public Meal(Burger burger, Drink drink, Dessert dessert, ArrayList<Topping> topping) {
        this.burger = burger;
        this.drink = drink;
        this.dessert = dessert;
    }

    public double getAllPrice() {
        return burger.getPrice()
                + (burger.getToppingList() != null ? burger.getToppingsPrice() : 0)
                + drink.getPrice()
                + dessert.getPrice();
    }


}
