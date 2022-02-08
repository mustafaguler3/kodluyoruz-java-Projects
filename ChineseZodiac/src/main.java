import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();

        if (year>0) {
            if (year%12 == 0){
                System.out.print("Your Chinese Zodiac Sign: MONKEY");
            }
            else if (year%12 == 1) {
                System.out.print("Your Chinese Zodiac Sign: RORO");
            }
            else if (year%12 == 2) {
                System.out.print("Your Chinese Zodiac Sign: DOG");
            }
            else if (year%12 == 3) {
                System.out.print("Your Chinese Zodiac Sign: PIG");
            }
            else if (year%12 == 4) {
                System.out.print("Your Chinese Zodiac Sign: MOUSE");
            }
            else if (year%12 == 5) {
                System.out.print("Your Chinese Zodiac Sign: OX");
            }
            else if (year%12 == 6) {
                System.out.print("Your Chinese Zodiac Sign: TIGER");
            }
            else if (year%12 == 7) {
                System.out.print("Your Chinese Zodiac Sign: RABBIT");
            }
            else if (year%12 == 8) {
                System.out.print("Your Chinese Zodiac Sign: DRAGON");
            }
            else if (year%12 == 9) {
                System.out.print("Your Chinese Zodiac Sign: SNAKE");
            }
            else if (year%12 == 10) {
                System.out.print("Your Chinese Zodiac Sign: HORSE");
            }
            else if (year%12 == 11) {
                System.out.print("Your Chinese Zodiac Sign: SHEEP");
            }

        }
        else
        {
            System.out.println("no valid number");
        }
    }
}
