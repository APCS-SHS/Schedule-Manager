import java.util.Calendar;
import java.util.Date;
/**
 * Write a description of class Schedule here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MySchedule
{
    private int month;
    private int day;
    private int year;
    private Calendar cal;
    private Task[] tasks;
    private Event[] events;
    public MySchedule(){
        cal=cal.getInstance();
        
    }
    public Date getDate(){
        return cal.getTime();
    }
    
}
