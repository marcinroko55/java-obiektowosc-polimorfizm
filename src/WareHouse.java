public class WareHouse {
    private static Drink drinks[] = new Drink[100];
    private static int indexDrinks = 0;

    public static void addDrink(Drink drink) {
        if (indexDrinks < drinks.length)
            drinks[indexDrinks++] = drink;
    }

    public static void display() {
        for (int i = 0; i < indexDrinks; i++) {
            drinks[i].display();
        }
    }
}
