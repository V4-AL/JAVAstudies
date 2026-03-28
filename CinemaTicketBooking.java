import java.util.Scanner;

public class CinemaTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to track bookings
        int totalTickets = 0;
        double totalCost = 0.0;
        int choice;
        
        // Do-while loop for menu
        do {
            // Display menu
            System.out.println("\n=== Cinema Ticket Booking ===");
            System.out.println("1. Regular Ticket - ₵25.00");
            System.out.println("2. Student Ticket - ₵15.00");
            System.out.println("3. VIP Ticket - ₵50.00");
            System.out.println("4. Finish Booking");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            // Process user selection
            switch (choice) {
                case 1:
                    totalTickets++;
                    totalCost += 25.00;
                    System.out.println("Regular ticket added!");
                    break;
                case 2:
                    totalTickets++;
                    totalCost += 15.00;
                    System.out.println("Student ticket added!");
                    break;
                case 3:
                    totalTickets++;
                    totalCost += 50.00;
                    System.out.println("VIP ticket added!");
                    break;
                case 4:
                    System.out.println("Finishing booking...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
            
        } while (choice != 4);
        
        // Display booking summary
        System.out.println("\n=== Booking Summary ===");
        
        if (totalTickets == 0) {
            System.out.println("No tickets booked.");
        } else if (totalTickets >= 1 && totalTickets <= 3) {
            System.out.println("Booking Type: Standard booking");
            System.out.println("Total Tickets: " + totalTickets);
            System.out.printf("Total Cost: ₵%.2f%n", totalCost);
        } else { // totalTickets > 3
            System.out.println("Booking Type: Group booking");
            System.out.println("Total Tickets: " + totalTickets);
            System.out.printf("Total Cost: ₵%.2f%n", totalCost);
        }
        
        scanner.close();
    }
}