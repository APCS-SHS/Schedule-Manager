import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class MouseAction extends Applet implements MouseListener,MouseMotionListener
{
    private int x=0;
    private int y=0;
    
    
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
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
    public void mouseMoved(MouseEvent me) //motion
    {
        
    }
    public void mouseDragged(MouseEvent me) //motion
    {
    }
    public void update(Graphics g){
        paint(g);
    }
    public void paint(Graphics g)
    {
        g.setColor(ColorLibKhavkhalyuk.RNDCOLORak());
        g.fillOval(x-20,y-20,40,40);
        
    }
}