import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String userName, password;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Your Username :");
        userName = scanner.nextLine();

        System.out.printf("Your password :");
        password = scanner.nextLine();


        if (userName.equals("musty") && password.equals("123")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Your informations are wrong. Do you want to reset your password ?  ");
            System.out.println("If you want to reset password please press '1'");
            System.out.println("If you don't want to reset password please press '2'");
            System.out.print("Your choice : ");

            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Please create new password");
                    System.out.print("Your new password : ");
                    Scanner inp1 = new Scanner(System.in);
                    password = inp1.nextLine();

                    if (password.equals("musty")) {
                        System.out.println("new password can't be same the one you used before ");
                    } else {
                        System.out.println("Your password was created");
                    }
                    break;
                case 2:
                    System.out.println("Try again");
                    break;
            }
        }
    }
}

















