Program 3 - Make Calculator to performance basic arithmetic operations
import java.util.Scanner;
public class calc
{
 public static void main(String args[])
 {
 float a, b, res;
 int ch;
 Scanner scan = new Scanner(System.in);
 do
 {
 System.out.print("1. Addition\n");
 System.out.print("2. Subtraction\n");
 System.out.print("3. Multiplication\n");
 System.out.print("4. Division\n");
 System.out.print("5. Exit\n\n");
 System.out.print("Enter Your Choice : ");
 ch = scan.nextInt();
 switch(ch)
 {
 case 1 : System.out.print("Enter Two Number : ");
 a = scan.nextFloat();
 b = scan.nextFloat();
 res = a + b;
 System.out.print("Result = " + res);
 break;
 case 2 : System.out.print("Enter Two Number : ");
 a = scan.nextFloat();
 b = scan.nextFloat();
 res = a - b;
 System.out.print("Result = " + res);
 break;
 case 3 : System.out.print("Enter Two Number : ");
 a = scan.nextFloat();
 b = scan.nextFloat();
 res = a * b;
 System.out.print("Result = " + res);
 break;
 case 4 : System.out.print("Enter Two Number : ");
 a = scan.nextFloat();
 b = scan.nextFloat();
 res = a / b;
 System.out.print("Result = " + res);
 break;
 case 5 : System.exit(0);
 break;
 default : System.out.print("Wrong Choice!!!");
 break;
 }
 System.out.print("\nwelcome\n");
 }while(ch != 5);
 }
}