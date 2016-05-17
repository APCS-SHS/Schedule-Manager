import java.util.*;
public class busySquare extends Screen
{
    private boolean busy;
    private String day;
    int x = 0;

    public busySquare()
    {
        // initialise instance variables
        x = 0;
    }

    public int sampleMethod(int y)
    {
        if (busy == true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter which day of the week you are busy: ");
            day = sc.nextLine();
        }
        if(day == "Sunday")
            x = w/2-233;
        else if(day == "Monday")
            x = w/2-166;
        else if(day == "Tuesday")
            x = w/2-103;
        else if(day == "Wednesday")
            x = w/2-30;
        else if(day == "Thursday")
            x = w/2+48;
        else if(day == "Friday")
            x = w/2+110;
        else if(day == "Saturday")
            x = w/2+177;
        else
        {
            System.out.println("ERROR OCCURED! Please Try Again: ");
            day = sc.nextLine();
        }
        return x;
    }
}
