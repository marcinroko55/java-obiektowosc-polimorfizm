public class Beer extends Drink {
    private double alcoholContent;

    public Beer(double volume, String ingredients, double alcoholContent) {
        super(volume, ingredients);
        this.alcoholContent = alcoholContent;
    }

    public void display() {
        super.display();
        System.out.println("Alcohol Content: " + alcoholContent + "%");
    }
}
