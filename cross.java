import java.util.Scanner;
public class Cross {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfCamps = sc.nextInt();

      
        int[] noOfCitizensIn1Camp = new int[noOfCamps];


        int totalCitizenCount = 0;
        
        for (int i=0;i<noOfCamps;i++){
            noOfCitizensIn1Camp[i] = sc.nextInt();
            totalCitizenCount+=noOfCitizensIn1Camp[i]; 
       }

        System.out.println(totalCitizenCount);

    }
}
