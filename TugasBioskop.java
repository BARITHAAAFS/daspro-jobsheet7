import java.util.Scanner;

public class TugasBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TICKET_PRICE = 50000;
        int totalTickets = 0;
        double totalSales = 0;
        int customer = 0;

        System.out.println("=== Cinema Ticket Sales ===");
        System.out.println("(Enter 0 tickets to finish the day)");

        while (true) {
            System.out.print("Customer " + (customer + 1) + " - number of tickets: ");
            int tickets = sc.nextInt();

            if (tickets < 0) {
                System.out.println("Invalid input. Re-enter a valid number of tickets!");
                continue;
            }
            if (tickets == 0) {
                break; 
            }

            double price = (double) tickets * TICKET_PRICE;
            double discount = 0;
            if (tickets > 10) {
                discount = 0.15;
            } else if (tickets > 4) {
                discount = 0.10;
            }
            double toPay = price - (price * discount);

            System.out.println("  Discount : " + (int) (discount * 100) + "%");
            System.out.println("  To pay   : Rp " + String.format(Locale.US, "%,.0f", toPay));

            totalTickets += tickets;
            totalSales += toPay;
            customer++;
        }

        System.out.println("---------------------------");
        System.out.println("Total tickets sold : " + totalTickets);
        System.out.println("Total ticket sales : Rp " + String.format(Locale.US, "%,.0f", totalSales));
    }
}