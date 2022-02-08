import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number.");
        a = scanner.nextInt();
        System.out.println("Enter second number.");
        b = scanner.nextInt();
        System.out.println("Enter third number.");
        c = scanner.nextInt();

        if((a > b) && (a > c)){
            if(b > c){
                System.out.println("the smallest -> "+c);
            }else {
                System.out.println("the smallest ->"+b);
            }
        }else if(b > a){
            System.out.println("the smallest ->"+a);
        }else if((c > a) && (c > b)){
            if(a > b){
                System.out.println("the smallest ->" +b);
            }else {
                System.out.println("the smallest ->"+a);
            }
        }


    }


}
