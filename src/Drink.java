public class Drink {
    private double volume;
    private String ingredients;

    public Drink(double volume, String ingredients) {
        this.volume = volume;
        this.ingredients = ingredients;
    }

    public void display() {
        System.out.println("Volume: " + volume);
        System.out.println("Ingredients: " + ingredients);
    }
}
