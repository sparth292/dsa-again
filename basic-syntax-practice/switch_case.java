import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Fruit");
        String fruit = input.next();
        //fruit.equals("Mango");
        /*
        lets take an example
        where

    public static void main(String[] args) {
        String a = "Parth";
        String b = "Parth";
        System.out.println(a==b); HERE IT CHECKS THE REFERENCE
        System.out.println(a.equals(b)); HERE IT CHECK THE STRING
    }



         */

      // Enhanced Style
        switch (fruit) {
            case "apple" -> System.out.println("Keeps the doctor away");
            case "mango" -> System.out.println("King of Fruits");
            case "banana" -> System.out.println("Lol hi");
            default -> System.out.println("Unexpected value: " + fruit);
        }

      // Old Style
        switch (fruit) {
            case "apple":
                System.out.println("Keeps the doctor away");
                break;
            case "mango":
                System.out.println("King of Fruits");
                break;
            case "banana":
                System.out.println("Lol hi");
                break;
            default:
                System.out.println("Unexpected value: " + fruit);
                break;
        }

        System.out.println("Enter a number : ");
        int day = input.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid number between 1 to 7");
        }


    }
}
