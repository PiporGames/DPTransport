import java.util.*; 

/**
 * Write a description of class ComparadorTaxiLocation here.
 * 
 * @author (your name)     
 * @version (a version number or a date)
 */
public class ComparadorTaxiNombre implements Comparator<Taxi>
{       
    public int compare(Taxi t1, Taxi t2){  
        return (t1.getName().compareTo(t2.getName()));
    } 
}