import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * Write a description of class TaskEventForms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TaskEventForm
{
    public JPanel getTeForm(int te){
        if(te==1){
            return tForm(); 
        }
        else if(te==2){
            return eForm();
        }
        else
            return null;
    }
    public JPanel tForm(){
        //We need:
        //Task name
        //Task start Date/Time
        //Task end Date/Time
        //Repeats -- How Often (will use repeatForm);
        //Task Priority.
        //Task Description.

    }
    public JPanel eForm(){
        //we need:
        //Event name
        //Event start Date/Time
        //Event stop Date/Time
        //Repeats -- How Often (will use repeatForm);
        //EventDescription
    }
}
