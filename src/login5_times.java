import java.util.Scanner;

public class login5_times {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Username = "nishant";
        String Password = "12345";
        String inputUsername;
        String inputPassword;
        for (int num = 1; num <= 5; num++){
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            if (username.equals(Username) && password.equals(Password)) {
                System.out.println("Login successful!");
                break;
            }
            else if (num == 1 || num == 2 || num ==3 || num ==4) {
                System.out.println("Try Again");
            }
            else if(num == 5){
                System.out.println("Login invalid due to many times wrong excess");
            }
        }
    }
}
