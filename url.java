import java.util.Scanner;
public class Secureurl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ");
        String url = sc.nextLine();
        System.out.println("Enter the start string");
        String start = sc.nextLine();
        String urlStart = url.substring(0,start.length());
        System.out.println(url+" " + (urlStart.equals(start) ? " starts ": " does not start ") + " with " + start);
    }
}
