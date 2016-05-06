
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
    }

    public void destroy()
    {
    }

    public String getAppletInfo()
    {
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }

    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
