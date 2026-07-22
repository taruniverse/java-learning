package design_patterns.template_method;

public class Main {
    public static void main(String[] args) {
        Drink tea = new Tea();
        Drink coffee = new Coffee();

        tea.prepare();
        coffee.prepare();
    }
}

abstract class Drink {
    final void prepare() {
        boilWater();
        addMainIngredient();
        pourInCup();
    }

    void boilWater() {
        System.out.println("Boil water");
    }

    abstract void addMainIngredient();

    void pourInCup() {
        System.out.println("Pour in cup");
    }
}

class Tea extends Drink {
    void addMainIngredient() {
        System.out.println("Add tea leaves");
    }
}

class Coffee extends Drink {
    void addMainIngredient() {
        System.out.println("Add coffee powder");
    }
}

