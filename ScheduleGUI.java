import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.*;
/**
 * Write a description of class ScheduleGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScheduleGUI extends JFrame implements ActionListener
{
    private MySchedule schedule;
    private JButton newTask,newEvent,confirm;
    private JMenuBar menuBar;
    private JTextField teName,teStart;//te= event/task
    private JPanel teButtons,tForm,eForm;
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
        TaskEventListener teListener=new TaskEventListener();
        menuBar=new JMenuBar();
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
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(newTask));
    }
}
