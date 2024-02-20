import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {

        
        String[] daysOfWeek = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        
        String[] daysOfWeek = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number (1 - 7 only)");
        int dayNumber = sc.nextInt();
        System.out.println("Day of the week is "+daysOfWeek[dayNumber-1]);
        sc.close();
    }
}
