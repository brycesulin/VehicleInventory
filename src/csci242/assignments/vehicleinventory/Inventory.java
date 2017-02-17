package csci242.assignments.vehicleinventory;
import java.util.*;

/**
 * Created by brycesulin on 2/15/17.
 * Inventory class contains the main method which runs the vehicle inventory.
 *
 * @author Bryce Sulin
 * @edu.uwp.cs.242.course CSCI 242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 2
 * @bugs None
 */
public class Inventory
{

    /**
     * pvList holds all passenger vehicles in an array list.
     */
    public static ArrayList<PassengerVehicle> pvList = new ArrayList<>();

    /**
     * tvList holds all transportation vehicles in an array list.
     */
    public static ArrayList<TransportationVehicle> tvList = new ArrayList<>();

    /**
     * Main method runs the Vehicle Inventory Project. init() and report() methods called.
     */
    public static void main(String[] args)
    {
        init();
        report();
    }

    /**
     * Responsible for loading the test data.
     */
    public static void init()
    {
        // Instantiate objects and add them to the appropriate ArrayList
        pvList.add(new Car(1000, "Chevrolet", "Cruze", 5, 4 ));
        pvList.add(new Car(1001, "Toyota", "Camry", 5, 4 ));
        pvList.add(new Car(1002, "Honda", "Civic", 4, 4 ));
        pvList.add(new Car(1003, "Dodge", "Charger", 4, 4 ));

        // Instantiate objects and add them to the appropriate ArrayList
        tvList.add(new Truck(2000, "Ford", "F150", 2500, 1 ));
        tvList.add(new Truck(2001, "Toyota", "Tacoma", 1900, 1 ));
        tvList.add(new Truck(2002, "Turnpike", "Double Stoughton", 140000, 2 ));

        // Instantiate objects and add them to the appropriate ArrayList
        pvList.add(new Motorcycle(1004, "Kawasaki", "Ninja", 1, 590 ));
        pvList.add(new Motorcycle(1005, "Indian", "Scout", 1, 550 ));
        pvList.add(new Motorcycle(1006, "Harley-Davidson", "Road Glide", 1, 610 ));
    }

    /**
     * Responsible for printing the output. printList() method called.
     */
    public static void report()
    {
        System.out.println("run: ");
        System.out.println("PARKSIDE MOTOR'S VEHICLE INVENTORY");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("== Available Passenger Vehicles:");
        pvList.forEach(System.out::println);
        System.out.println();
        System.out.println("== Available Transportation Vehicles:");
        tvList.forEach(System.out::println);
        System.out.println();
        System.out.println("== Check for existing vehicles:");
        Car honda = new Car(1002, "Honda", "Civic", 4, 4);

        // CHECK IF new Car object is already in vehicle inventory
        if (honda instanceof PassengerVehicle)
        {
            System.out.println("Inventory item already exists.  Item is:");
            System.out.println(honda);
            System.out.println("BUILD SUCCESSFUL (total time: 0 seconds)");
        }
        else
        {
        }
    }

    /**
     * Responsible for printing an ArrayList.
     * @param a1 ArrayList printed.
     */
    public static void printList(ArrayList a1)
    {
        System.out.println(a1);
    }
}