package csci242.assignments.vehicleinventory;

/**
 * Created by brycesulin on 2/15/17.
 * Truck class contains
 *
 * @author Bryce Sulin
 * @edu.uwp.cs.242.course CSCI 242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 2
 * @bugs None
 */
public class Truck extends TransportationVehicle
{
    /**
     * Class variable stores the number of containers the vehicle has.
     */
    protected int numOfContainers;

    /**
     * Default class constructor.
     */
    public Truck()
    {
        super();
    }

    /**
     * Truck constructor holds all the parameters required for truck inventory.
     *
     * @param startVin is an int that holds the vehicleId value.
     * @param startManufacturer is a string that holds the manufacturer value.
     * @param startModel is a string that holds the model value.
     * @param startLoadCapacity is an int that holds the # passengers value.
     * @param startContainers is an int that holds the weight value.
     */
    public Truck(int startVin, String startManufacturer, String startModel, int startLoadCapacity, int startContainers)
    {
        super();
        vehicleId = startVin;
        manufacturer = startManufacturer;
        model = startModel;
        loadCapacity = startLoadCapacity;
        numOfContainers = startContainers;
    }

    /**
     * getNumOfContainers method obtains the # containers the truck can carry.
     *
     * @return an int that is the # of containers.
     */
    public int getNumOfContainers()
    {
        return this.numOfContainers;
    }

    /**
     * setNumOfContainers method sets the value of the containers variable.
     *
     * @param startContainers is the int that containers variable is assigned to.
     */
    public void setNumOfContainers(int startContainers)
    {
        this.numOfContainers = startContainers;
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
     * toString method displays a string output of the truck object.
     *
     * @return a string representation of the truck object.
     */
    @Override
    public String toString()
    {
        return "TRUCK - " + this.manufacturer + " " + this.model + " VIN:" + this.vehicleId + " Load Capacity:" + this.loadCapacity +
                " Containers:" + this.numOfContainers;
    }
}