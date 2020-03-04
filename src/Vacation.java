import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String placeType = "";
        double placePrice = 0;
        String placeClass = "";
        if (budjet <= 1000) {
            placeClass = "Camp";
            if (season.equals("Summer")) {
                placeType = "Alaska";
                placePrice = 0.65 * budjet;
            } else {
                placeType = "Morocco";
                placePrice = 0.45 * budjet;
            }
        } else if (budjet <= 3000) {
            placeClass = "Hut";
            if (season.equals("Summer")) {
                placeType = "Alaska";
                placePrice = 0.8 * budjet;
            } else {
                placeType = "Morocco";
                placePrice = 0.6 * budjet;
            }
        } else {
            placeClass = "Hotel";
            if (season.equals("Summer")) {
                placeType = "Alaska";
                placePrice = 0.9 * budjet;
            } else {
                placeType = "Morocco";
                placePrice = 0.9 * budjet;
            }
        }
        System.out.printf("%s - %s - %.2f", placeType, placeClass, placePrice);
    }
}
