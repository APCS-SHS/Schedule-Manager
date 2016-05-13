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
        System.out.println(ae.getSource());
    }
}
