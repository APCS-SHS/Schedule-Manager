import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class TaskEventForms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TaskEventForm implements ActionListener
{
    private JTextField nameField;
    private JTextArea descriptionField;
    private JButton confirmTE,cancelTE,repeating;
    boolean repeats;
    public TaskEventForm(){
        nameField=new JTextField();
        JButton repeating=new JButton("Event Repeat");
        repeating.addActionListener(this);
    }
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
        //Task name  *
        //Task due Date/Time     *  //Only will show up as notice for end date/time
        
        //Task Priority.
        //Task Description.   *
        return null;
    }
    public JPanel eForm(){
        //we need:
        //Event name      *
        //Event start Date/Time     
        //Event stop Date/Time     //will show continuous
        //Repeats -- How Often (will use repeatForm);   
        //Event Description  *
        return null;
    }
    public void actionPerformed(ActionEvent ae){
        //if 
    }
}
