import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int n1,n2,select;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        n1 = scanner.nextInt();
        System.out.println("Enter second number");
        n2 = scanner.nextInt();


        System.out.println("1-Addition\n2-Substraction\n3-Multiplication\4-Division");
        System.out.println("Your choice :");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Addition :"+(n1+n2));
                break;
            case 2:
                System.out.println("Substraction :"+(n1-n2));
                break;
            case 3:
                System.out.println("Multiplication :"+(n1*n2));
                break;
            case 4:
                System.out.println("Division :"+(n1/n2));
                break;
            default:
                System.out.println("*Error*");
        }



    }
}

















