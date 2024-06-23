GROUP 9
HOSPITALITY CONSOLE APPLICATION I.E HOTEL RESERVATION SYSTEM
Group Report on Class Design, Inheritance, Polymorphism, and Encapsulation

Class Design
The console program is made using multiple classes representing different entities in a hotel reservation system. The main classes are  ` Main`, `Person`, `Guest`, `Room`, and `Booking`.
1. Main class: This is a class in the code that contains the menu used for user interactivity.
2. Person Class: This class represents a person with attributes like `name`, `age`, and `contact`. It includes methods for getting and setting these attributes and a method to display the information.
3. Guest Class: This class extends the `Person` class, adding specific attributes for guests, such as `guestId`, `stayDuration`, and `roomNumber`. It includes additional methods to get and set these attributes and to display guest-specific information.
4. Room Class: This class represents a room in the hotel with attributes like `roomNumber`, `roomType`, and `pricePerNight`. It includes methods to get and set these attributes and a method to display room information.
5. Booking Class: This class represents a booking with attributes such as `bookingId`, `guest`, `room`, and `numberOfNights`. It includes methods to get and set these attributes, display booking information, and calculate the total cost of the booking.

Inheritance
Inheritance is used in the code to create a hierarchical relationship between the `Person` and `Guest` classes. 
The `Guest` class is a subclass of the `Person` class, inheriting its attributes and methods. This allows the `Guest` class to reuse the code from the `Person` class and add its specific attributes and methods.
The Booking class also inherits from class Guest because it inherits its attribute and methods.

Polymorphism
Polymorphism is an object-oriented programming (OOP) concept that refers to the ability of a variable, function or object to take on multiple forms.
Polymorphism is demonstrated through method overriding and method overloading.



1. Method Overriding: 
In our code we managed to use it in the guest class so as to get some information from the person class.
The `Guest` class overrides the `displayInfo` method of the `Person` class to include additional information specific to guests.

Example from our code:
@Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("Guest ID: " + guestId);
    System.out.println("Stay Duration: " + stayDuration + " days");
    System.out.println("Room Number: " + roomNumber);
}

2. Method Overloading: This can be implemented by defining multiple methods with the same name but different parameters within a class. It is a common practice in object-oriented programming to enhance functionality. Though we did not use it in our code because we lacked how to use its functionality in it.

Encapsulation
Encapsulation is achieved by using private access modifiers for the class attributes and providing public getter and setter methods to access and modify these attributes. This ensures that the internal state of an object is protected from unauthorized access and modification.
 Private Attributes: The attributes in each class are declared as private to restrict direct access.
Example from our code
private String name;
private int age;
private String contact;



 Getter and Setter Methods: Public methods are provided to access and modify the private attributes.
Example from our code
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

User Interaction
The main class (`Main`) includes a text-based menu system that allows users to interact with the application. Users can create new guests, create new bookings, display booking information, and calculate the total cost through a series of prompts and inputs.

Conclusion
This console program demonstrates the use of classes, inheritance, polymorphism, and encapsulation in a structured and organized manner. Each class is designed to represent a specific entity in the hotel reservation system, and inheritance is used to create a logical hierarchy. Polymorphism allows methods to behave differently based on the object type, and encapsulation ensures that the internal state of objects is protected. The user interaction through the text-based menu system makes the application user-friendly and interactive.
#REJECT FINANCE BILL

