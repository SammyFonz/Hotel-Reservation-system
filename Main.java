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
/**
 * Person class - represents a person's attributes.
 */
class Person {
    private String name;
    private int age;
    private String contact;

    /**
     * Constructor to initialize a Person object.
     * @name: name of the person.
     * @age: age of the person.
     * @contact: contact information.
     */
    public Person(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    /**
     * getName-gets the name of the person.
     * returns: The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * setName-sets the name of the person.
     * @name: The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getAge-gets the age of the person.
     * return: The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * setAge-Sets the age of the person.
     * @age: The new age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * getContact-Get the contact information.
     * return: The contact information.
     */
    public String getContact() {
        return contact;
    }

    /**
     * setContact-Set the contact information of the person.
     * @contact:The new contact information of the person.
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * displayInfo-Method to display information about the person.
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
    }
}
/**
 * Guest class represents a guest extending the Person class with additional attributes.
 */
class Guest extends Person {
    private String guestId;
    private int stayDuration;
    private String roomNumber;

    /**
     * Guest-Constructor to initialize a Guest object.
     * @name: The name of the guest.
     * @age: The age of the guest.
     * @contact: The contact information of the guest.
     * @guestId: The ID of the guest.
     * @stayDuration: The duration of the guest's stay.
     * @oomNumber: The room number assigned to the guest.
     */
    public Guest(String name, int age, String contact, String guestId, int stayDuration, String roomNumber) {
        super(name, age, contact);
        this.guestId = guestId;
        this.stayDuration = stayDuration;
        this.roomNumber = roomNumber;
    }

    /**
     * getGuestId-Getter for the guest ID.
     * return: guest ID.
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * setGuestId-Setter for the guest ID.
     * @guestId: The new guest ID.
     */
    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    /**
     * getStayDuration-Getter for the stay duration of the guest.
     * return: The stay duration in days.
     */
    public int getStayDuration() {
        return stayDuration;
    }

    /**
     * setStayDuration-Setter for the stay duration of the guest.
     * @stayDuration: The new stay duration in days.
     */
    public void setStayDuration(int stayDuration) {
        this.stayDuration = stayDuration;
    }

    /**
     * getRoomNumber-Getter for the room number assigned to the guest.
     * return: The room number.
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * setRoomNumber-Setter for the room number assigned to the guest.
     * @roomNumber The new room number.
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * displayInfo-Method to display information about the guest, overriding the superclass method.
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Guest ID: " + guestId);
        System.out.println("Stay Duration: " + stayDuration + " days");
        System.out.println("Room Number: " + roomNumber);
    }

    /**
     * Method to calculate the bill for the guest's stay.
     * @pricePerNight: The price per night for the room.
     * return: The total bill amount.
     */
    public double calculateBill(double pricePerNight) {
        return stayDuration * pricePerNight;
    }
}
/**
 * Room class represents a room in the hotel with its attributes.
 */
class Room {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    /**
     * Room-Constructor to initialize a Room object.
     * @roomNumber: The room number.
     * @roomType: The type of room.
     * @pricePerNight: The price per night for the room.
     */
    public Room(String roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    /**
     * getRoomNumber-Getter for the room number.
     * return: The room number.
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * setRoomNumber-Setter for the room number.
     * @roomNumber: The new room number.
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * getRoomType-Getter for the room type.
     * return: The room type.
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * setRoomType-Setter for the room type.
     * @roomType: The new room type.
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * getPricePerNight-Getter for the price per night for the room.
     * return: The price per night.
     */
    public double getPricePerNight() {
        return pricePerNight;
    }

    /**
     * setPricePerNight-Setter for the price per night for the room.
     * @pricePerNight The new price per night.
     */
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    /**
     * displayInfo-Method to display information about the room.
     */
    public void displayInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Night: " + pricePerNight);
    }
}

public class Booking {
    private String bookingId;
    private Guest guest;
    private Room room;
    private int numberOfNights;

    public Booking(String bookingId, Guest guest, Room room, int numberOfNights) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void displayInfo() {
        System.out.println("Booking ID: " + bookingId);
        guest.displayInfo();
        room.displayInfo();
        System.out.println("Number of Nights: " + numberOfNights);
    }

    public double calculateTotalCost() {
        return numberOfNights * room.getPricePerNight();
    }
}
