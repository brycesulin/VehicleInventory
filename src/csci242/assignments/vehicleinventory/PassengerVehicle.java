package csci242.assignments.vehicleinventory;

/**
 * Created by brycesulin on 2/15/17.
 * PassengerVehicle class contains
 *
 * @author Bryce Sulin
 * @edu.uwp.cs.242.course CSCI 242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 2
 * @bugs None
 */
public class PassengerVehicle extends Vehicle
{
    /**
     * Stores the number of average sized passengers a vehicle can carry.
     */
    protected int numOfPassengers;

    /**
     * Class default constructor.
     */
    public PassengerVehicle ()
    {
        super();
    }

    /**
     * PassengerVehicle constructor holds the parameter for the class variable.
     *
     * @param startPassengers is an int that holds the number of passengers.
     */
    public PassengerVehicle (int startPassengers)
    {
        super();
        numOfPassengers = startPassengers;
    }

    /**
     * getNumOfPassengers method obtains the numOfPassengers variable.
     *
     * @return an int that is the average number of vehicle passengers.
     */
    public Integer getNumOfPassengers()
    {
        return this.numOfPassengers;
    }

    /**
     * setNumOfPassengers method sets the value of numOfPassengers variable.
     *
     * @param startPassengers is the int that numOfPassengers variable is assigned to.
     */
    public void setNumOfPassengers(int startPassengers)
    {
        this.numOfPassengers = startPassengers;
    }
}
