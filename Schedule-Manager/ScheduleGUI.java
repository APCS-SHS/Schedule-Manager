import javax.swing.JFrame;
/**
 * Write a description of class ScheduleGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScheduleGUI extends JFrame
{
    public ScheduleGUI(String name){
        super(name);
    }
    public static void run(){
        ScheduleGUI frame=new ScheduleGUI("Schdule Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close on Exit
        //Display the GUI
        frame.pack();
        frame.setVisible(true);
    }
}
