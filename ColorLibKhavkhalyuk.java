import java.util.*;
import java.awt.*;

public class ColorLibKhavkhalyuk
{
    public static Color BROWNak(){
        return new Color(160,82,45);
    }
    public static Color PURPLEak(){
        return new Color(153,0,153);
    }
    public static Color PINKak(){
        return new Color(255,15,201);
    }
    public static Color SKYBLUEak(){
        return new Color(15,229,255);
    }
    public static Color DARKGREENak(){
        return new Color(11,71,36);
    }
    public static Color DARKYELLOWak(){
        return new Color(204,204,0);
    }
    public static Color GRAYak(){
        return new Color(153,153,153);
    }
    public static Color RNDCOLORak(){
        int red=(int)(Math.random()*255+1);
        int green=(int)(Math.random()*255+1);
        int blue=(int)(Math.random()*255+1);
        return new Color(red,green,blue);
    }
    public static Color RNDREDak(){
        int red=(int)(Math.random()*255+1);
        return new Color(red,0,0);
    }
    public static Color RNDGREENak(){
        int green=(int)(Math.random()*255+1);
        return new Color(0,green,0);
    }
    public static Color RNDBLUEak(){
        int blue=(int)(Math.random()*255+1);
        return new Color(0,0,blue);
    }
}