/**
 * Created with IntelliJ IDEA. User: lo Date: 8/27/13 Time: 12:49 PM To change this template use
 * File | Settings | File Templates.
 */
public class ArrayTest implements Test{

    public static void main(String[] argc) {

    int num[] = {55, 2, 37, 9, 8};

    System.out.println("Original array is: ");
    for (int i : num)
        System.out.print(i + " ");

    for (int i = 0 ; i < 5 / 2; i++) {
        int temp = num[i];
        num[i] = num[num.length -1 - i];
        num[num.length - i - 1] = temp;
    }

    System.out.println("\nReversed array is: ");
    for (int i : num)
        System.out.print(i + " ");

    System.out.println(" ");
    }

    @Override
    public void doTest() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
