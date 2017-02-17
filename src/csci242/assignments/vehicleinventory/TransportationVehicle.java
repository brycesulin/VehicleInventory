package csci242.assignments.vehicleinventory;

/**
 * Created by brycesulin on 2/15/17.
 * TransportationVehicle class contains
 *
 * @author Bryce Sulin
 * @edu.uwp.cs.242.course CSCI 242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 2
 * @bugs None
 */
public class TransportationVehicle extends Vehicle
{
    /**
     * Class variable loadCapacity stores the number of pounds the vehicle can safely carry in a load.
     */
    protected int loadCapacity;

    /**
     * Class default constructor.
     */
    public TransportationVehicle ()
    {
        super();
    }

    /**
     * TransportationVehicle constructor holds the parameter for the class variable
     * @param startLoadCapacity is an int that holds the number of pounds vehicle can safely carry.
     */
    public TransportationVehicle (int startLoadCapacity)
    {
        super();
        loadCapacity = startLoadCapacity;
    }

    /**
     * getLoadCapacity method obtains the loadCapacity variable.
     *
     * @return an int that holds the number of pounds vehicle can safely carry.
     */
    public Integer getLoadCapacity()
    {
        return this.loadCapacity;
    }

    /**
     * setLoadCapacity method sets the value of loadCapacity variable.
     *
     * @param startLoadCapacity is the int that loadCapacity variable is assigned to.
     */
    public void setLoadCapacity(int startLoadCapacity)
    {
        this.loadCapacity = startLoadCapacity;
    }
}