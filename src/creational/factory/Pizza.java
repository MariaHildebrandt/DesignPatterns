package creational.factory;

public abstract class Pizza {
    public abstract void addIngredients();

    public void bakePizza(){
        System.out.println("Pizza backed at 400 for 20 minutes.");
    }
}
