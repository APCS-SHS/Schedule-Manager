
/**
 * Write a description of class Tasks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Task
{
    private int day,month,year,hour;
    private String name;
    public Task(String taskName,int priority,Schedule start,Schedule stop){
        name=taskName;
    }
}
