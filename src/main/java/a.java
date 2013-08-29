import java.util.Scanner;

/**
 * Created with IntelliJ IDEA. User: lo Date: 8/28/13 Time: 7:55 PM To change this template use File
 * | Settings | File Templates.
 */
public class a {
    public static void main(String args[]){
            boolean done = false;
            int oper;
            Scanner input = new Scanner(System.in);
            System.out.println("McMackins Calc v2.0 (Now with fewer crashes!)");
            while (!done)
            {
                System.out.println("What operation? (0 for quit, 1 for add, 2 for subtract, 3 for multiply, 4 for divide, 5 for divide with remainder, 6 for average, 7 for account interest):");
                while (!input.hasNextInt()){
                    System.out.println("Enter a valid integer.");
                    input.next();
                }
                oper = input.nextInt();
                switch (oper){
                    case 0:
                        System.out.println(1);
                        break;
                    case 1:
                        System.out.println(2);
                        break;
                    default:
                        System.out.println("Invalid entry.");
                        break;
                }
            }
            input.close();
        }

}
