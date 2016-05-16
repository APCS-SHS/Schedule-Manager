import java.awt.*;
//import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;

public class Screen extends Applet implements ActionListener
{
    private int selection;
    private Button button1;
    private Button button2;
    private String day;
    private int x;

    public void init()
    {
        selection = 0;
        button1 = new Button("Army Time");
        add(button1);
        button1.addActionListener(this);
        button2 = new Button("AM/PM");
        add(button2);
        button2.addActionListener(this);
        day = "";
        x = 0;
    }

    public void actionPerformed(ActionEvent ae)
    {
        selection = 0;
        if(ae.getSource().equals(button1))
            selection = 1;
        else if(ae.getSource().equals(button2))
            selection = 2;
        repaint();
    }

    public void paint(Graphics g)
    {
        int w=getWidth();
        int h=getHeight();
        
        //buttons
        if(selection == 1)
            armyTime(g);
        else if(selection == 2)
            ampm(g);
  
        //day
        if(day == "Sunday")
            x = w/2-233;
        if(day == "Monday")
            x = w/2-166;
        if(day == "Tuesday")
            x = w/2-103;
        if(day == "Wednesday")
            x = w/2-30;
        if(day == "Thursday")
            x = w/2+48;
        if(day == "Friday")
            x = w/2+110;
        if(day == "Saturday")
            x = w/2+177;
        
        //setup
        setBackground(Color.white);
        
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
        
        //square
        g.setColor(Color.red);
        g.fillRect(427, 63, 50, 15);

    }
    
    public void busySquare(Graphics g, int x)
    {
        g.setColor(Color.red);
        g.fillRect(x, 65, 50, 15);
    }

    public void armyTime(Graphics g)
    {
        int w=getWidth();
        int h=getHeight();
        g.setColor(Color.black);
        g.drawString("0", w/2-251, h/2-173);
        g.drawString("1", w/2-251, h/2-155);
        g.drawString("2", w/2-251, h/2-137);
        g.drawString("3", w/2-251, h/2-119);
        g.drawString("4", w/2-251, h/2-101);
        g.drawString("5", w/2-251, h/2-83);
        g.drawString("6", w/2-251, h/2-65);
        g.drawString("7", w/2-251, h/2-47);
        g.drawString("8", w/2-251, h/2-29);
        g.drawString("9", w/2-251, h/2-11);
        g.drawString("10", w/2-258, h/2+7);
        g.drawString("11", w/2-258, h/2+25);
        g.drawString("12", w/2-258, h/2+43);
        g.drawString("13", w/2-258, h/2+61);
        g.drawString("14", w/2-258, h/2+79);
        g.drawString("15", w/2-258, h/2+97);
        g.drawString("16", w/2-258, h/2+115);
        g.drawString("17", w/2-258, h/2+133);
        g.drawString("18", w/2-258, h/2+151);
        g.drawString("19", w/2-258, h/2+169);
        g.drawString("20", w/2-258, h/2+187);
        g.drawString("21", w/2-258, h/2+205);
        g.drawString("22", w/2-258, h/2+223);
        g.drawString("23", w/2-258, h/2+241);
    }

    public void ampm(Graphics g)
    {
        int w=getWidth();
        int h=getHeight();
        g.setColor(Color.black);
        g.drawString("AM 12", w/2-282, h/2-173);
        g.drawString("1", w/2-251, h/2-155);
        g.drawString("2", w/2-251, h/2-137);
        g.drawString("3", w/2-251, h/2-119);
        g.drawString("4", w/2-251, h/2-101);
        g.drawString("5", w/2-251, h/2-83);
        g.drawString("6", w/2-251, h/2-65);
        g.drawString("7", w/2-251, h/2-47);
        g.drawString("8", w/2-251, h/2-29);
        g.drawString("9", w/2-251, h/2-11);
        g.drawString("10", w/2-258, h/2+7);
        g.drawString("11", w/2-258, h/2+25);
        g.drawString("PM 12", w/2-281, h/2+43);
        g.drawString("1", w/2-251, h/2+61);
        g.drawString("2", w/2-251, h/2+79);
        g.drawString("3", w/2-251, h/2+97);
        g.drawString("4", w/2-251, h/2+115);
        g.drawString("5", w/2-251, h/2+133);
        g.drawString("6", w/2-251, h/2+151);
        g.drawString("7", w/2-251, h/2+169);
        g.drawString("8", w/2-251, h/2+187);
        g.drawString("9", w/2-251, h/2+205);
        g.drawString("10", w/2-258, h/2+223);
        g.drawString("11", w/2-258, h/2+241);
    }
}