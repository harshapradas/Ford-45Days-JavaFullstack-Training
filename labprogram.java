import java.util.Scanner;
public class LabAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();
        System.out.println("Enter z");
        int z = sc.nextInt();

        System.out.println(x<y&&x<z?"L1":(y<z?"L2":"L3")+" has the minimal seating capacity");
    }
}
