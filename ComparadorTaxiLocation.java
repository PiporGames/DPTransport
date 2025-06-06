import java.util.*; 

/**
 * Compares Taxis by their distance to a certain location.
 * If two of them are equally distant to the specified location,
 * their names are used to compare instead.
 * 
 * @author José, Manuel y David
 * @version 2023.11.1
 */
public class ComparadorTaxiLocation implements Comparator<Taxi>
{       
    private Location destination;
     
    public void setLocationDestination(Location location){
        destination = location;
    }
    
    public int compare(Taxi t1, Taxi t2){  
        int d1 = t1.getLocation().distance(destination);
        int d2 = t2.getLocation().distance(destination);
        if(d1 == d2){
            return (t1.getName().compareTo(t2.getName())); 
        }
        else if(d1 < d2){
            return -1;            
        }
        else {
            return 1;
        }
    } 
}