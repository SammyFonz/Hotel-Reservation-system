import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class for managing hotel reservations application.
 */
public class Main {
    /**
     * Main method where the program execution starts.
     * @args: Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Room room = null;
        Guest guest = null;
        Booking booking = null;

        while (true) {
            System.out.println("SERENA HOTEL:");
            System.out.print("WELCOME TO OUR HOTEL RESERVATIONS APPLICATION: ");

            System.out.println("\n\n   OPTIONS:");
            System.out.println("1. Create New Guest");
            System.out.println("2. Create New Booking");
            System.out.println("3. Display Booking Information");
            System.out.println("4. Calculate Total Cost");
            System.out.println("5. Exit");
            System.out.print("\n#OCCUPY PARLIAMENT: ");
            System.out.print("\n#REJECT FINANCE BILL: ");

            System.out.print("\n\nCHOOSE AN OPTION: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                try {
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter your age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter your contact: ");
                    String contact = scanner.nextLine();

                    System.out.print("Enter your guest ID: ");
                    String guestId = scanner.nextLine();

                    System.out.print("Enter your stay duration: ");
                    int stayDuration = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter your room number: ");
                    String roomNumber = scanner.nextLine();

                    guest = new Guest(name, age, contact, guestId, stayDuration, roomNumber);
                    System.out.println("Guest created successfully.");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please re-enter your data correctly.");
                    scanner.nextLine();
                }
            } else if (choice == 2) {
                if (guest == null) {
                    System.out.println("Please create a guest first.");
                } else {
                    System.out.print("Enter room type: ");
                    String roomType = scanner.nextLine();
                    System.out.print("Enter price per night: ");
                    double pricePerNight = scanner.nextDouble();
                    scanner.nextLine();

                    room = new Room(guest.getRoomNumber(), roomType, pricePerNight);

                    System.out.print("Enter your booking ID: ");
                    String bookingId = scanner.nextLine();
                    System.out.print("Enter the number of nights you'll spend: ");
                    int numberOfNights = scanner.nextInt();
                    scanner.nextLine();

                    booking = new Booking(bookingId, guest, room, numberOfNights);
                    System.out.println("Booking created successfully.");
                }
            } else if (choice == 3) {
                if (booking != null) {
                    booking.displayInfo();
                } else {
                    System.out.println("No booking found. Please make a booking first.");
                }
            } else if (choice == 4) {
                if (booking != null) {
                    System.out.println("Total Cost: " + booking.calculateTotalCost());
                } else {
                    System.out.println("No booking found. Please create a booking first.");
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

