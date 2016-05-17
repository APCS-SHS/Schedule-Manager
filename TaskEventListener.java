import java.awt.event.*;
/**
 * Write a description of class teListener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TaskEventListener implements ActionListener
{
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getActionCommand().equals("New Task")){
            ScheduleGUI.newTaskEvent(0);
        }
        if(ae.getActionCommand().equals("New Event")){
            ScheduleGUI.newTaskEvent(1);
        }
        
    }
    
}
