import java.util.*;
public class Interaction
{
    boolean busy = false;
    boolean hour = false;
    
    public static void main(boolean busy)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add new item?(t/f): ");
        busy = scan.nextLine();
        if (busy == true)
        {
            System.out.println("Which day?(su/m/t/w/th/f/s): ");
            day = scan.nextChar();
            if(day == su)
            {}
            else if(day == m)
            {}
            else if(day == t)
            {}
            else if(day == w)
            {}
            else if(day == th)
            {}
            else if(day == f)
            {}
            else if(day == s)
            {}
            else
            {}
            
        }
        else
        {
            
        }
    }
    
    public boolean check(String day, int num)
    {
        boolean hour = false;
        return hour;
    }
}
