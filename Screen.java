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
        //days
        g.setColor(ColorLibKhavkhalyuk.PINKak());
        g.drawString("Sunday", 25, 50);
        g.setColor(Color.orange);
        g.drawString("Monday", 85, 50);
        g.setColor(Color.yellow);
        g.drawString("Tuesday", 145, 50);
        g.setColor(Color.green);
        g.drawString("Wednesday", 210, 50);
        g.setColor(Color.blue);
        g.drawString("Thursday", 293, 50);
        g.setColor(ColorLibKhavkhalyuk.SKYBLUEak());
        g.drawString("Friday", 365, 50);
        g.setColor(ColorLibKhavkhalyuk.PURPLEak());
        g.drawString("Saturday", 415, 50);
        //lines
        g.setColor(Color.black);
        g.drawLine(10, 60, 490, 60);
        g.drawLine(78, 42, 78, 500);
        g.drawLine(140, 42, 140, 500);
        g.drawLine(203, 42, 203, 500);
        g.drawLine(287, 42, 287, 500);
        g.drawLine(358, 42, 358, 500);
        g.drawLine(410, 42, 410, 500);
        //numbers
        g.drawString("1", 3, 75);
        g.drawString("2", 3, 92);
        g.drawString("3", 3, 109);
        g.drawString("4", 3, 126);
        g.drawString("5", 3, 143);
        g.drawString("6", 3, 160);
        g.drawString("7", 3, 177);
        g.drawString("8", 3, 194);
        g.drawString("9", 3, 211);
        g.drawString("10", 3, 228);
        g.drawString("11", 3, 245);
        g.drawString("12", 3, 262);
        g.drawString("13", 3, 279);
        g.drawString("14", 3, 296);
        g.drawString("15", 3, 313);
        g.drawString("16", 3, 330);
        g.drawString("17", 3, 347);
        g.drawString("18", 3, 364);
        g.drawString("19", 3, 381);
        g.drawString("20", 3, 398);
        g.drawString("21", 3, 415);
        g.drawString("22", 3, 432);
        g.drawString("23", 3, 449);
        g.drawString("24", 3, 466);

    }

    public void destroy()
    {
    }

    public void busySquare(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(250, 250, 55, 30);
    }
}

