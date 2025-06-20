package JavaPrograms;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // 3.1 Read different types of input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a boolean: ");
        boolean b = sc.nextBoolean();

        sc.nextLine(); // clear buffer
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 3.2 Print all values
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b);
        System.out.println("String: " + str);

        // 3.3 Arithmetic operations
        System.out.println("Sum of int + float = " + (num + f));
        System.out.println("Double * int = " + (d * num));

        sc.close(); // 3.5 Close scanner


	}

}
