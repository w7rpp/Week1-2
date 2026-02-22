import java.util.Scanner;
public class DiscountedAmountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee;
        double discountPercent;
        System.out.print("Enter fee: ");
        fee = sc.nextDouble();
        System.out.print("Enter discount percent: ");
        discountPercent = sc.nextDouble();
        double discountPrice = (discountPercent / 100) * fee;
        double discountFee = fee - discountPrice;
        System.out.println("The Discount Amount is INR " + discountPrice +
                " and Final Discounted Fee is INR " + discountFee);
        sc.close();
    }
}