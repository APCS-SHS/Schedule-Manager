import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
    private static JMenuBar menuBar;
    private JTextField teName,teStart;//te= event/task
    private JPanel teButtons,tForm,eForm;
    private TaskEventListener teListener=new TaskEventListener();
    
    public ScheduleGUI(String name){
        super(name);
    }
    
    public static void run(){
        ScheduleGUI frame=new ScheduleGUI("Schdule Manager");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);//Exit when quit;
        frame.initMenuBar();//Create Menu Bar
        frame.setJMenuBar(menuBar);//Add Menu Bar
        frame.createNewTaskEventButtons();//Create and Add Buttons
        
        //Display the GUI
        frame.pack();
        frame.setVisible(true);
    }
    private void initMenuBar(){
        menuBar=new JMenuBar();//Create JMenuBar MenuBar
        JMenu teNew=new JMenu("New");// Create Menu "New"
        JMenuItem nEvent=new JMenuItem("New Event");
        nEvent.addActionListener(teListener);
        JMenuItem nTask=new JMenuItem("New Task");
        nTask.addActionListener(teListener);
        teNew.add(nTask);
        teNew.add(nEvent);
        menuBar.add(teNew);
        
    }
    private void createNewTaskEventButtons(){
        newTask=new JButton("New Task");
        newTask.setToolTipText("Create a new task.");
        newTask.addActionListener(teListener);
        newEvent=new JButton("New Event");
        newEvent.setToolTipText("Create a new event.");
        newEvent.addActionListener(teListener);
        teButtons=new JPanel();
        teButtons.add(newTask);//Add newTask to teButtons
        teButtons.add(newEvent);//Add newEvent to teButtons
        getContentPane().add(teButtons,BorderLayout.PAGE_END);//Add teButtons
        
    }
    public static void newTaskEvent(int taskEvent){
        if(taskEvent==0){
            
            
        }
        if(taskEvent==1){
            
        }
    }
    
    
    
}
