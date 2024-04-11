import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1");
      int a = sc.nextInt();
      System.out.println("Enter the number 2");
      int b = sc.nextInt();
      System.out.println("enter the options to be perform \n1. addition \n2. subtraction. \n3 multiplication. \n4 Division");
      int options= sc.nextInt();
      switch (options) {
        case 1:
            System.out.println(a+b);
            break;
         case 2:
            System.out.println(a-b);
            break;    
         case 3:
            System.out.println(a*b);
            break;
         case 4:
            System.out.println(a/b);
            break;
        default:
        System.out.println();
            break;
      }
    }
    
}
