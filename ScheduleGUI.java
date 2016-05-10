import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Write a description of class ScheduleGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScheduleGUI extends JFrame
{
    private Schedule schedule;
    private JButton newTask,newEvent,confirm;
    private JMenuBar menuBar;
    private JTextField etName,etStart;//et= event/task
    
    public ScheduleGUI(String name){
        super(name);
    }
    public static void run(){
        ScheduleGUI frame=new ScheduleGUI("Schdule Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close on Exit
        frame.initComponents();
        //Display the GUI
        frame.pack();
        frame.setVisible(true);
    }
    private void initComponents(){
        newTask=new JButton("New Task");
        newEvent=new JButton("New Event");
        newTask.setToolTipText("Create a new task.");
        newEvent.setToolTipText("Create a new event.");
        
    }
}
