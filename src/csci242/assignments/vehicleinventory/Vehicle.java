package csci242.assignments.vehicleinventory;

/**
 * Created by brycesulin on 2/15/17.
 * Vehicle class contains three variables: vehicleId, manufacturer, and model.
 * All of these variables are encapsulated with getter and setter methods.
 *
 * @author Bryce Sulin
 * @edu.uwp.cs.242.course CSCI 242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 2
 * @bugs None
 */
public class Vehicle
{
    /**
     * Stores the vehicles unique identifier
     */
    protected int vehicleId;

    /**
     * Stores the company that manufactures the vehicle.
     */
    protected String manufacturer;

    /**
     * Stores the model of the vehicle.
     */
    protected String model;

    /**
     * Vehicle class default constructor.
     */
    public Vehicle()
    {}

    /**
     * Vehicle constructor holds the parameters for the three class variables.
     *
     * @param startVin is the vehicles unique identifier.
     * @param startManufacturer is the company that manufactures the vehicle.
     * @param startModel is the vehicle model.
     */
    public Vehicle(int startVin, String startManufacturer, String startModel)
    {
        vehicleId = startVin;
        manufacturer = startManufacturer;
        model = startModel;
    }

    /**
     * getVehicleId method obtains the value of vehicleId variable.
     *
     * @return an int that is the particular vehicle's unique identifier.
     */
    public Integer getVehicleId()
    {
        return this.vehicleId;
    }

    /**
     * setVehicleId method sets the value of vehicleId variable.
     *
     * @param startVin is the integer that vehicleId variable is assigned to.
     */
    public void setVehicleId(int startVin)
    {
        this.vehicleId = startVin;
    }

    /**
     * getManufacturer method obtains the vehicle's manufacturer.
     *
     * @return a String that is the vehicle's manufacturer
     */
    public String getManufacturer()
    {
        return this.manufacturer;
    }

    /**
     * setVehicleId method sets the value of manufacturer variable.
     *
     * @param startManufacturer is the String that manufacturer variable is assigned to.
     */
    public void setManufacturer(String startManufacturer)
    {
        this.manufacturer = startManufacturer;
    }

    /**
     * getModel method obtains the vehicle's model type.
     *
     * @return a String that is the vehicle's model.
     */
    public String getModel()
    {
        return this.model;
    }

    /**
     * setModel method sets the value of model variable.
     *
     * @param startModel is the String that model variable is assigned to.
     */
    public void setModel(String startModel)
    {
        this.model = startModel;
    }
}