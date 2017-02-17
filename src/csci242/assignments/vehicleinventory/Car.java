package csci242.assignments.vehicleinventory;

/**
 * Created by brycesulin on 2/15/17.
 * Car class contains
 *
 * @author Bryce Sulin
 * @edu.uwp.cs.242.course CSCI 242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 2
 * @bugs None
 */
public class Car extends PassengerVehicle
{
    /**
     * Class variable stores the number of doors on the vehicle.
     */
    protected int numOfDoors;

    /**
     * Default class constructor.
     */
    public Car()
    {
        super();
    }

    /**
     * Car constructor holds all the parameters required for car inventory.
     *
     * @param startVin          is an int that holds the vehicleId value.
     * @param startManufacturer is a string that holds the manufacturer value.
     * @param startModel        is a string that holds the model value.
     * @param startPassengers   is an int that holds the # passengers value.
     * @param startDoors        is an int that holds the # doors value.
     */
    public Car(int startVin, String startManufacturer, String startModel, int startPassengers, int startDoors)
    {
        super();
        vehicleId = startVin;
        manufacturer = startManufacturer;
        model = startModel;
        numOfPassengers = startPassengers;
        numOfDoors = startDoors;
    }

    /**
     * getNumOfDoors method obtains the # of doors.
     *
     * @return an int that is the # of doors.
     */
    public int getNumOfDoors() {
        return this.numOfDoors;
    }

    /**
     * setNumOfDoors method sets the value of numOfDoors variable.
     *
     * @param startDoors is the int that numOfDoors variable is assigned to.
     */
    public void setNumOfDoors(int startDoors) {
        this.numOfDoors = startDoors;
    }

    /**
     * equals method tests if two different objects have the same content.
     *
     * @param o is an object
     * @return true if object o is inherited from vehicle class.
     */
    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Vehicle)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * toString method displays a string output of the car object.
     *
     * @return a string representation of the car object.
     */
    @Override
    public String toString()
    {
        return "CAR - " + this.manufacturer + " " + this.model + " VIN:" + this.vehicleId + " Passengers:" + this.numOfPassengers +
                " Doors:" + this.numOfDoors;
    }
}