import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // Exercise1

        Scanner scan = new Scanner (System.in);
        /*
        String greeting = scan.nextLine();

        System.out.println(greeting);
        System.out.println(greeting);
        System.out.println(greeting);
        */

        // Exercise2
        /*
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num2);
        System.out.println(num1);
        */

        //Exercise3
        /*
        String line1 = "  *   *  ";
        String line2 = " *** *** ";
        String line3 = "*********";
        String line4 = "*********";
        String line5 = "  *****  ";
        String line6 = "    *    ";

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        */

        //Exercise4
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String name3 = scan.nextLine();

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        System.out.printf("name - %s, grade - %f" + "\n", name1, num1);
        System.out.printf("name - %s, grade - %f\n", name2, num2);
        System.out.printf("name - %s, grade - %f\n", name3, num3);

    }


}
