package csci242.assignments.vehicleinventory;

/**
 * Created by brycesulin on 2/15/17.
 * Motorcycle class contains
 *
 * @author Bryce Sulin
 * @edu.uwp.cs.242.course CSCI 242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 2
 * @bugs None
 */
public class Motorcycle extends PassengerVehicle
{
    /**
     * Stores the weight of the vehicle
     */
    protected int weight;

    /**
     * Default class constructor.
     */
    public Motorcycle()
    {
        super();
    }

    /**
     * Motorcycle constructor holds all the parameters required for motorcycle inventory.
     *
     * @param startVin is an int that holds the vehicleId value.
     * @param startManufacturer is a string that holds the manufacturer value.
     * @param startModel is a string that holds the model value.
     * @param startPassengers is an int that holds the # passengers value.
     * @param startWeight is an int that holds the weight value.
     */
    public Motorcycle(int startVin, String startManufacturer, String startModel, int startPassengers, int startWeight)
    {
        super();
        vehicleId = startVin;
        manufacturer = startManufacturer;
        model = startModel;
        numOfPassengers = startPassengers;
        weight = startWeight;
    }

    /**
     * getWeight method obtains the weight.
     *
     * @return an int that is the vehicle weight.
     */
    public int getWeight()
    {
        return this.weight;
    }

    /**
     * setWeight method sets the value of the weight variable.
     *
     * @param startWeight is the int that weight variable is assigned to.
     */
    public void setWeight(int startWeight)
    {
        this.weight = startWeight;
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
     * toString method displays a string output of the motorcycle object.
     *
     * @return a string representation of the motorcycle object.
     */
    @Override
    public String toString()
    {
        return "MOTORCYCLE - " + this.manufacturer + " " + this.model + " VIN:" + this.vehicleId + " Passengers:" + this.numOfPassengers +
                " Weight:" + this.weight;
    }
}