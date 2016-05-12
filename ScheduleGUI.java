import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
/**
 * Write a description of class ScheduleGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScheduleGUI extends JFrame
{
    private MySchedule schedule;
    private JButton newTask,newEvent,confirm;
    private JMenuBar menuBar;
    private JTextField teName,teStart;//te= event/task
    private JPanel teButtons;
    public ScheduleGUI(String name){
        super(name);
    }
    
    public static void run(){
        ScheduleGUI frame=new ScheduleGUI("Schdule Manager");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);//Prompt before quitting...
        frame.initComponents();
        //Display the GUI
        frame.pack();
        frame.setVisible(true);
    }
    private void initComponents(){
        menuBar=new JMenuBar();
        newTask=new JButton("New Task");
        newTask.setToolTipText("Create a new task.");
        newEvent=new JButton("New Event");
        newEvent.setToolTipText("Create a new event.");
        teButtons=new JPanel();
        teButtons.add(newTask);//Add newTask to teButtons
        teButtons.add(newEvent);//Add newEvent to teButtons
        getContentPane().add(teButtons,BorderLayout.PAGE_END);//Add teButtons
        
    }
}
