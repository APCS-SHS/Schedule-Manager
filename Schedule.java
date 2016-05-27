import java.util.Calendar;
import java.util.Date;
/**
 * Write a description of class Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Schedule
{
    private Calendar startCal;
    
    private Calendar endCal;
    
    /**
     * Constructor for objects of class Event
     */
    public Schedule(Calendar stop)
    {
        endCal=stop;
    }
    public Schedule(Calendar start,Calendar stop)
    {
        startCal=start;
        endCal=stop;
    }
    public Schedule(int year,int month,int date){
        endCal=endCal.getInstance();
        endCal.set(year,month,date);
    }
    public Schedule(int year,int month,int date,int hour,int min){
        endCal=endCal.getInstance();
        endCal.set(year,month,date,hour,min,0);
    }
    public Schedule(int year,int month,int date,int hour,int min,int sec){
        endCal=endCal.getInstance();
        endCal.set(year,month,date,hour,min,sec);
    }
    public Date getEndCal(){
        return endCal.getTime();
    }
    public Date getStartCal(){
        return startCal.getTime();
    }
    
}
