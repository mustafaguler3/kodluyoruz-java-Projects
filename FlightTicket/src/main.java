import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double perKm = 0.10;
        int km,age,travelType,totalPrice,discount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter km :");
        km = scanner.nextInt();

        totalPrice = (int) (km*perKm);

        System.out.println("Enter your age :");
        age = scanner.nextInt();

        System.out.println("Enter travel type :");
        travelType = scanner.nextInt();

        if(km > 0 && age > 0){
            if(age < 12){
                totalPrice = (int) (totalPrice*0.50);
            }else if(age >= 12 && age <= 24){
                totalPrice = (int) (totalPrice*0.90);
            }else if(age > 65){
                totalPrice = (int) (totalPrice*0.70);
            }
        }else {
            System.out.println("you entered a unvalid informations");
        }

        if(travelType == 2){
            totalPrice = (int) (totalPrice*0.80);
            totalPrice = totalPrice*2;
        }


        System.out.println("Total Price :"+totalPrice + "Tl");








    }
}
