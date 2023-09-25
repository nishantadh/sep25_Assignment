import java.util.Scanner;

public class billing_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("               Menu                ");
        System.out.println("1.Momo   Rs100        2.Burger   Rs 150");
        System.out.println("enter food : ");
        int selectItem = 0;
        selectItem = scanner.nextInt();
        int selectQuantity;
        selectQuantity = scanner.nextInt();
        System.out.println("please wait");
        System.out.println("order has been placed successfully");
        System.out.println("               Bill               ");
        int totalAmount = 0;
        if (selectItem == 1){
            totalAmount = 100 * selectQuantity;
        }
        else if(selectItem == 2){
            totalAmount = 150 * selectQuantity;
        }
        System.out.println(totalAmount);
        double afterDiscount = totalAmount - (0.1 * totalAmount);
        double total = afterDiscount + (0.13) * afterDiscount;
        System.out.println("The total price is" + total);
    }
}
