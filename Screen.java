import java.awt.*;
import javax.swing.*;

public class Screen extends JApplet
{
    public void init()
    {
    }

    public void start()
    {
    }

    public void stop()
    {
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.black);
        g.drawString("Schedule Manager", 205, 20);
        g.drawString("Sunday", 25, 50);
        g.drawString("Monday", 85, 50);
        g.drawString("Tuesday", 145, 50);
        g.drawString("Wednesday", 210, 50);
        g.drawString("Thursday", 293, 50);
        g.drawString("Friday", 365, 50);
        g.drawString("Saturday", 415, 50);
        g.drawLine(10, 60, 490, 60);
    }

    public void destroy()
    {
    }

}