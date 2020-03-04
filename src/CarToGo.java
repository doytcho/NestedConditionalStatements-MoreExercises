import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String carType = "";
        double carPrice = 0;
        String carClass = "";
        if (budjet <= 100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = 0.35 * budjet;
            } else {
                carType = "Jeep";
                carPrice = 0.65 * budjet;
            }
        } else if (budjet <= 500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = 0.45 * budjet;
            } else {
                carType = "Jeep";
                carPrice = 0.8 * budjet;
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            carPrice = 0.9 * budjet;
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
