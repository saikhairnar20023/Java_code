import java.sql.SQLOutput;
import java.util.*;
public class Condition_stat {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int x = sc.nextInt();

          if (x % 2 ==0) {
              System.out.println("even");
          } else {
              System.out.println("odd");

          }

          //Next example
          int age = sc.nextInt();

          if (age > 18) {
              System.out.println("Adult");
          } else {
              System.out.println("Not adult");
          }

          // Another example
          int a = sc.nextInt();
          int b = sc.nextInt();

          if (a==b) {
              System.out.println("equal");
          } else if (a>b) {
                  System.out.println("A is greater");
          } else {
                   System.out.println("A is smaller");
          }


          // Switch statements
        int button = sc.nextInt();
        switch(button) {
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("Konnichiwa");
            break;
            default:
                System.out.println("invalid button");


        }



    }
}