/**
 * Model a passenger wishing to get from one
 * location to another.
 * 
 * @author Jose, Manuel & David
 * @version 2023.10.10
 */
public class Passenger
{
    private String name;
    private Location pickup;
    private Location destination;
    private String taxiName;

    /**
     * Constructor for objects of class Passenger
     * @param pickup The pickup location, must not be null.
     * @param destination The destination location, must not be null.
     * @param name The passenger's name
     * @throws NullPointerException If either location is null.
     */
    public Passenger(Location pickup, Location destination, String name)
    {
        if(pickup == null) {
            throw new NullPointerException("Pickup location");
        }
        if(destination == null) {
            throw new NullPointerException("Destination location");
        }
        this.pickup = pickup;
        this.destination = destination;
        this.name = name;
        this.taxiName = null;
    }

    /**
     * @return The name of the passenger.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The destination location.
     */
    public Location getDestination()
    {
        return destination;
    }
    
    /**
     * Return details of the passenger, such as where it is.
     * @return A string representation of the passenger.
     */
    public String toString()
    {
        return "Passenger "+getName()+" travelling from " +
        pickup + " to " + destination;
    }
    
    /**
     * @return The pickup location
     */    
    public Location getPickup() 
    {   
        return pickup;
    }
    
    /**
     * Sets the name of the taxi.
     * @param taxiName The taxi's name
     */    
    public void setTaxiName(String taxiName)
    {
        this.taxiName = taxiName;
    }
    
    /**
     * @return The taxi's name
     */  
    public String getTaxiName()
    {
        return taxiName;
    }
    
    /**
     * Show the final information about the passenger, including the name of the taxi that used.
     */
    public String showFinalInfo()
    {
        return "Passenger " + getName() + " in " + getDestination() 
                +  " transported by: " + getTaxiName();
    }

}
