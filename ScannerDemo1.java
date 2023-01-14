
package Class5;
import java.util.Scanner;
public  class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double weight;
        /*
        Scanner => name of the class
        scan is just a variable like we create primitive variables
        = =>assignment operator
        System.in => (get something from the console)tells the computer we want to read the data from keyboard.
        */

        System.out.println("Please Enter you age ");
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please Enter your weight");
        double weight1= scan.nextDouble();
        System.out.println("Your weight is "+weight1+" Kg");
        System.out.println("Are you hungry? ");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);
        System.out.println("Please Enter your gender");

       char gender= scan.next().charAt(0); // char type of input
        System.out.println("Your gender is "+gender);

        System.out.println("Please Enter your name");
        String name=scan.next();
        System.out.println("Your name is "+ name);

        scan.nextLine(); //Trick to make nextLine method work after we have used any other method from
        //scanner Class

        System.out.println("Please Enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close(); // good practice
    }
}
