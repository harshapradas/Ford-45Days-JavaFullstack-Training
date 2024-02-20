import java.util.Scanner;
public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Price of item 1 : ");
        float item1Price = sc.nextFloat();
        System.out.print("Price of item 2 : ");
        float item2Price = sc.nextFloat();
        System.out.print("Discount in percentage : ");
        int discount = sc.nextInt();

        float totalAmount = item1Price+item2Price;
        System.out.println("Total amount : $"+totalAmount);

        float amountDiscounted = (float) (discount/100.0)*totalAmount;
        float discountedAmount = (float) (totalAmount-amountDiscounted);
        System.out.println("Discounted amount : $"+String.format("%.2f",discountedAmount));
        System.out.println("Saved amount : $"+String.format("%.2f",amountDiscounted));
    }
}
