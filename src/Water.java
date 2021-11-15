public class Water extends Drink {
    private String typeOfWater;

    public Water(double volume, String ingredients, String typeOfWater) {
        super(volume, ingredients);
        this.typeOfWater = typeOfWater;
    }

    public void display() {
        super.display();
        System.out.println("Type of water: " + typeOfWater);
    }
}
