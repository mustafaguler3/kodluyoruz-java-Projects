import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int heat;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature");

        heat = scanner.nextInt();

        if(heat < 5){
            System.out.print("you can go skiing");
        }else if(heat > 5 && heat < 15){
            System.out.print("you can go to cinema");
        }else if(heat>15 && heat<25){
            System.out.print("you can go to picnic");
        }else {
            System.out.print("you can go swimming");
        }

    }
}
