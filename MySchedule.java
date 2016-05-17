import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
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
    private ArrayList<Task> tasks=new ArrayList<Task>();
    private ArrayList<Event> events=new ArrayList<Event>();
    public MySchedule(){
        cal=cal.getInstance();
        
    }
    public Date getDate(){
        return cal.getTime();
    }
    public void addTask(Task t){
        tasks.add(t);
    }
    public void addEvent(Event e){
        events.add(e);
    }
    public ArrayList<Task> getTasks(){
        return tasks;
    }
    public ArrayList<Event> getEvents(){
        return events;
    }
}
