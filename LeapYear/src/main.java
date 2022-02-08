import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        boolean leap = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year :");

        int year = scanner.nextInt();

        if (year%4 == 0 && year % 100 != 0)
        {
            leap = true;
        }else if (year % 100 == 0 && year % 400 == 0)
        {
            leap = true;
        }else
        {
            leap = false;
        }





    }
}
