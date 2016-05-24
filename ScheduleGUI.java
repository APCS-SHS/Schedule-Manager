import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
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
    private static JMenuBar menuBar;
    private JTextField teName,teStart;//te= event/task
    private JPanel teButtons,tForm,eForm;
    private int taskEventStatus=0;
    //private TaskEventListener teListener=new TaskEventListener();
    private Task task;
    private Event event;
    private JTextField nameField;
    private JTextArea descriptionField;
    private JButton confirmTE,cancelTE,repeating;
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
        nEvent.addActionListener(this);
        JMenuItem nTask=new JMenuItem("New Task");
        nTask.addActionListener(this);
        teNew.add(nTask);
        teNew.add(nEvent);
        menuBar.add(teNew);
        
    }
    private void createNewTaskEventButtons(){
        newTask=new JButton("New Task");
        newTask.setToolTipText("Create a new task.");
        newTask.addActionListener(this);
        newEvent=new JButton("New Event");
        newEvent.setToolTipText("Create a new event.");
        newEvent.addActionListener(this);
        teButtons=new JPanel();
        teButtons.add(newTask);//Add newTask to teButtons
        teButtons.add(newEvent);//Add newEvent to teButtons
        changeVisibility(0);
        
    }
    
    private void changeVisibility(int visibility){
        if (visibility==0){
            getContentPane().removeAll();
            getContentPane().add(teButtons,BorderLayout.PAGE_END);//Add teButtons
        }
        if(visibility>0){
            getContentPane().remove(teButtons);
        }
        if(visibility==1){
            //getContentPane().add(TaskForm);
        }
        if(visibility==2){
            //getContentPane().add(EventForm);
        }
        repaint();
    }
    private void tForm(){
        nameField=new JTextField("Name");
        nameField.addActionListener(this);
    }
    private void eForm(){}
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getActionCommand().equals("New Task")){
            taskEventStatus=1;
            changeVisibility(taskEventStatus);
        }
        if(ae.getActionCommand().equals("New Event")){
            taskEventStatus=2;
            changeVisibility(taskEventStatus);
        }
        
        if(ae.getActionCommand().equals("Confirm")){
            if(taskEventStatus==1){
                
                //MySchedule.addTask(task);
            }
            
        }
    }
    
    
    
    
    
}
