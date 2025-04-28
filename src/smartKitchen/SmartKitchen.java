package smartKitchen;

public class SmartKitchen {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.setKitchenState(true, false, true);
        kitchen.getKitchenState();
    }

    private CoffeMaker brewCoffee;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewCoffee = new CoffeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public void setKitchenState(boolean coffeState, boolean dishwasherState, boolean fridgeState) {
        brewCoffee.hasWorkToDo.hasWorkToDo = coffeState;
        dishWasher.hasWorkToDo.hasWorkToDo = dishwasherState;
        iceBox.hasWorkToDo.hasWorkToDo = fridgeState;

        brewCoffee.brewCoffe();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

    public void getKitchenState() {
        System.out.printf("\u2022 coffe: %b \n \u2022 dishwasher: %b\n \u2022 fridge: %b\n",
                this.brewCoffee.hasWorkToDo,
                this.dishWasher.hasWorkToDo,
                this.iceBox.hasWorkToDo);
    }
}

class State {
    public boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class CoffeMaker {
    public State hasWorkToDo = new State();
    void brewCoffe() {
        if (hasWorkToDo.isHasWorkToDo()) {
            System.out.println("Brewing coffee");
            this.hasWorkToDo.setHasWorkToDo(false);
        } else {
            System.out.println("Nothing to do");
        }
    }
}

class DishWasher {
    public State hasWorkToDo = new State();
    public void doDishes() {
        if (hasWorkToDo.isHasWorkToDo()) {
            System.out.println("Doing dishes");
            this.hasWorkToDo.setHasWorkToDo(false);
        } else {
            System.out.println("Nothing to do");
        }
    }

}

class Refrigerator {
    public State hasWorkToDo = new State();
    public void orderFood() {
        if (hasWorkToDo.isHasWorkToDo()) {
            System.out.println("Ordering food");
            this.hasWorkToDo.setHasWorkToDo(false);
        } else {
            System.out.println("Nothing to do");
        }
    }
}





