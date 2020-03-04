import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        String tiketType = scan.nextLine();
        double peoples = Double.parseDouble(scan.nextLine());
        double transportCosts = 0;
        if (peoples <= 4) {
            transportCosts = budjet * 0.75;
        } else if (peoples <= 9) {
            transportCosts = budjet * 0.6;
        } else if (peoples <= 24) {
            transportCosts = budjet * 0.5;
        } else if (peoples <= 49) {
            transportCosts = budjet * 0.4;
        } else {
            transportCosts = budjet * 0.25;
        }
        double tiketsPriceTotal = 0;
        if (tiketType.equals("VIP")) {
            tiketsPriceTotal = 499.99 * peoples;
        } else {
            tiketsPriceTotal = 249.99 * peoples;
        }
        if (tiketsPriceTotal < budjet - transportCosts) {
            System.out.printf("Yes! You have %.2f leva left.", budjet - tiketsPriceTotal - transportCosts);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", tiketsPriceTotal - budjet + transportCosts);
        }
    }
}
