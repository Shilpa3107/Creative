import java.util.Calendar;

public class CurrentDates 
{
    public static void main(String args[]) 
    {
      
        Calendar obj = Calendar.getInstance();
        
        System.out.println("Current date and time : "+obj.toString());
        System.out.println("Current day of the month : "+obj.get(Calendar.DAY_OF_MONTH));
    }
}
