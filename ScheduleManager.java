
/**
 * Write a description of class ScheduleManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScheduleManager
{
    private static ScheduleGUI gui;
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){public void run(){gui.run();}});
    }
    
}
