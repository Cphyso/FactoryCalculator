import java.util.Scanner;

public class Main {

    public static String compute;

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter expression: ");
        compute = input.nextLine();
        String[] x = compute.split("\\D");

        Factory f = new Factory();
        Calculate y = f.getCorrectObj(compute);

        y.calculate(x);
    }
}
