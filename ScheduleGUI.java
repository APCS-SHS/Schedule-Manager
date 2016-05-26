import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.Dimension;
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
    private JPanel teButtons,tNamePanel,eNamePanel;
    private int taskEventStatus=0;
    
    //private TaskEventListener teListener=new TaskEventListener();
    private Container tContainer,eContainer;
    private Task task;
    private Event event;
    private JTextField nameField;
    private JTextArea descriptionField;
    private JButton confirmTE,cancelTE,repeating;
    private JSpinner spinner;
    public ScheduleGUI(String name){
        super(name);
    }

    public static void run(){
        ScheduleGUI frame=new ScheduleGUI("Schdule Manager");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);//Exit when quit
        frame.setupCal();
        frame.tForm();//Create the Task Form
        frame.eForm();//Create the Event Form
        frame.initMenuBar();//Create Menu Bar
        frame.setJMenuBar(menuBar);//Add Menu Bar
        frame.createNewTaskEventButtons();//Create and Add New Task Buttons

        //Display the GUI
        frame.pack();
        try{
            Dimension d=Toolkit.getDefaultToolkit().getScreenSize(); // Get screen dimensions
            frame.setSize(((int)(d.getWidth()/4)),((int)(d.getHeight()/4)));//Set size to 1/4 screen dimensions
        }
        catch (Exception e){//getScreenSize() will throw an exception if headless.
        }
        frame.setVisible(true);
    }

    private void setupCal(){
        schedule=new MySchedule();
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
        getContentPane().removeAll();

        if (visibility==0){
            getContentPane().add(teButtons,BorderLayout.PAGE_END);//Add teButtons
        }
        if(visibility==1){
            getContentPane().add(tNamePanel);
            repaint();
        }
        if(visibility==2){
            //getContentPane().add();
        }
        repaint();
    }

    private void tForm(){
        nameField=new JTextField();
        nameField.addActionListener(this);
        JLabel nameLabel=new JLabel("Name of Task:");
        tNamePanel=new JPanel();
        tNamePanel.add(nameLabel);
        tNamePanel.add(nameField);

    }

    private void eForm(){
    }

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
            if(taskEventStatus==2){

            }
            taskEventStatus=0;
            changeVisibility(taskEventStatus);
            
        }
    }

    
    
}
//  https://docs.oracle.com/javase/7/docs/api/javax/swing/SpinnerDateModel.html
//  http://docs.oracle.com/javase/tutorial/uiswing/components/spinner.html
//  https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html