import java.awt.*;
//import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;
import java.util.*;

public class busySquare extends Applet implements ActionListener,MouseListener
{
    int x = 0;
    int y = 0;

    public void init()
    {
        //choice
        colorChoice = new Choice();
        colorChoice.add("Choose Priority");
        colorChoice.add("High Priority");
        colorChoice.add("Medium Priority");
        colorChoice.add("Low Priority");
        add(colorChoice);
    }
    
    public void mouseExited(MouseEvent me)
    {
    }

    public void mouseEntered(MouseEvent me)
    {
    }

    public void mouseReleased(MouseEvent me)
    {
    }

    public void mousePressed(MouseEvent me)
    {
    }

    public void mouseClicked(MouseEvent me)
    {
        x=me.getX();
        y=me.getY();
        repaint();
    }

    public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    public void paint(Graphics g)
    {
        int w=getWidth();
        int h=getHeight();

        //priority colors
        String colorch = colorChoice.getSelectedItem();
        if(colorch.equals("Choose Priority")){
            color=Color.white;
        }
        else if(colorch.equals("High Priority")){
            color=Color.RED;
        }
        else if(colorch.equals("Medium Priority")){
            color=ColorLibKhavkhalyuk.DARKGREENak();
        }
        else if(colorch.equals("Low Priority")){
            color=Color.CYAN;
        }
        
        //day of the week
        if(y > h/2-208 && y < h/2-190)
        {
            if(x > w/2-240 && x < w/2-172) //sunday
            {
                xr = w/2-233;
            }
            else if(x > w/2-172 && x< w/2-110) //monday
            {
                xr = w/2-166;
            }
            else if(x > w/2-110 && x < w/2-47) //tuesday
            {
                xr = w/2-103;
            }
            else if(x > w/2-47 && x < w/2+37) //wednesday
            {
                xr = w/2-30;
            }
            else if(x > w/2+37 && x < w/2+108) //thursday
            {
                xr = w/2+48;
            }
            else if(x > w/2+108 && x < w/2+160) //friday
            {
                xr = w/2+110;
            }
            else if(x > w/2+160 && x < w/2+240) //saturday
            {
                xr = w/2+177;
            }
        }

        //square
        if(x > w/2-285 && x < w/2-250)
        {
            if(y > h/2-173 && y < h/2-155)
            {
                yr = h/2-173;
            }
            else if(y > h/2-155 && y < h/2-137)
            {
                yr = h/2-155;
            }
            else if(y > h/2-137 && y < h/2-119)
            {
                yr = h/2-137;
            }
            else if(y > h/2-119 && y < h/2-101)
            {
                yr = h/2-119;
            }
            else if(y > h/2-101 && y < h/2-83)
            {
                yr = h/2-101;
            }
            else if(y > h/2-83 && y < h/2-65)
            {
                yr = h/2-83;
            }
            else if(y > h/2-65 && y < h/2-47)
            {
                yr = h/2-65;
            }
            else if(y > h/2-47 && y < h/2-29)
            {
                yr = h/2-47;
            }
            else if(y > h/2-29 && y < h/2-11)
            {
                yr = h/2-29;
            }
            else if(y > h/2-11 && y < h/2+7)
            {
                yr = h/2-11;
            }
            else if(y > h/2+7 && y < h/2+25)
            {
                yr = h/2+7;
            }
            else if(y > h/2+25 && y < h/2+43)
            {
                yr = h/2+25;
            }
            else if(y > h/2+43 && y < h/2+61)
            {
                yr = h/2+43;
            }
            else if(y > h/2+61 && y < h/2+79)
            {
                yr = h/2+61;
            }
            else if(y > h/2+79 && y < h/2+97)
            {
                yr = h/2+79;
            }
            else if(y > h/2+97 && y < h/2+115)
            {
                yr = h/2+97;
            }
            else if(y > h/2+115 && y < h/2+133)
            {
                yr = h/2+115;
            }
            else if(y > h/2+133 && y < h/2+151)
            {
                yr = h/2+133;
            }
            else if(y > h/2+151 && y < h/2+169)
            {
                yr = h/2+151;
            }
            else if(y > h/2+169 && y < h/2+187)
            {
                yr = h/2+174;
            }
            else if(y > h/2+187 && y < h/2+205)
            {
                yr = h/2+193;
            }
            else if(y > h/2+205 && y < h/2+223)
            {
                yr = h/2+211;
            }
            else if(y > h/2+223 && y < h/2+241)
            {
                yr = h/2+230;
            }
        }

        g.setColor(color);
        g.fillRect(xr, yr, 50, 15);

    }

}
