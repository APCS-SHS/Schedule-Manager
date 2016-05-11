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
        int w=getWidth();
        int h=getHeight();
        
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
        g.setColor(Color.black);
        g.drawString("Schedule Manager", w/2-45, h/2-230);
        //days
        g.setColor(ColorLibKhavkhalyuk.PINKak());
        g.drawString("Sunday", w/2-225, h/2-200);
        g.setColor(Color.orange);
        g.drawString("Monday", w/2-165, h/2-200);
        g.setColor(Color.yellow);
        g.drawString("Tuesday", w/2-105, h/2-200);
        g.setColor(Color.green);
        g.drawString("Wednesday", w/2-40, h/2-200);
        g.setColor(Color.blue);
        g.drawString("Thursday", w/2+43, h/2-200);
        g.setColor(ColorLibKhavkhalyuk.SKYBLUEak());
        g.drawString("Friday", w/2+115, h/2-200);
        g.setColor(ColorLibKhavkhalyuk.PURPLEak());
        g.drawString("Saturday", w/2+165, h/2-200);
        //lines
        g.setColor(Color.black);
        g.drawLine(w/2-240, h/2-190, w/2+240, h/2-190);
        g.drawLine(w/2-172, h/2-208, w/2-172, h/2+250);
        g.drawLine(w/2-110, h/2-208, w/2-110, h/2+250);
        g.drawLine(w/2-47, h/2-208, w/2-47, h/2+250);
        g.drawLine(w/2+37, h/2-208, w/2+37, h/2+250);
        g.drawLine(w/2+108, h/2-208, w/2+108, h/2+250);
        g.drawLine(w/2+160, h/2-208, w/2+160, h/2+250);
        //numbers
        g.drawString("1", w/2-248, h/2-173);
        g.drawString("2", w/2-248, h/2-155);
        g.drawString("3", w/2-248, h/2-137);
        g.drawString("4", w/2-248, h/2-119);
        g.drawString("5", w/2-248, h/2-101);
        g.drawString("6", w/2-248, h/2-83);
        g.drawString("7", w/2-248, h/2-65);
        g.drawString("8", w/2-248, h/2-47);
        g.drawString("9", w/2-248, h/2-29);
        g.drawString("10", w/2-252, h/2-11);
        g.drawString("11", w/2-252, h/2+7);
        g.drawString("12", w/2-252, h/2+25);
        g.drawString("13", w/2-252, h/2+43);
        g.drawString("14", w/2-252, h/2+61);
        g.drawString("15", w/2-252, h/2+79);
        g.drawString("16", w/2-252, h/2+97);
        g.drawString("17", w/2-252, h/2+115);
        g.drawString("18", w/2-252, h/2+133);
        g.drawString("19", w/2-252, h/2+151);
        g.drawString("20", w/2-252, h/2+169);
        g.drawString("21", w/2-252, h/2+187);
        g.drawString("22", w/2-252, h/2+205);
        g.drawString("23", w/2-252, h/2+223);
        g.drawString("24", w/2-252, h/2+241);

    }

    public void destroy()
    {
    }

    public void busySquare(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(10, 65, 50, 15);
    }
}

