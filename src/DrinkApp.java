import java.util.Scanner;

public class DrinkApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        double volume;
        String ingredients;

        do {
            System.out.println("------------Available Factory Options------------");
            System.out.println("1 - add beer");
            System.out.println("2 - add water");
            System.out.println("3 - display all drinks");
            System.out.println("4 - stop");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter volume: ");
                    volume = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter ingredients: ");
                    ingredients = scanner.nextLine();
                    System.out.println("Alcohol Content: ");
                    double alcoholContent = scanner.nextDouble();
                    scanner.nextLine();

                    Beer beer = new Beer(volume, ingredients, alcoholContent);
                    WareHouse.addDrink(beer);
                    break;
                case 2:
                    System.out.println("Enter volume: ");
                    volume = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter ingredients: ");
                    ingredients = scanner.nextLine();
                    System.out.println("Type of water: ");
                    String typeOfWater = scanner.nextLine();

                    Water water = new Water(volume, ingredients, typeOfWater);
                    WareHouse.addDrink(water);
                    break;
                case 3:
                    WareHouse.display();
                    break;
            }

        } while (option != 4);
    }
}
