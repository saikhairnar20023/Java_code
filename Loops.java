import java.util.Scanner;
import java.util.*;
public class Loops {
    public static void main(String[] args) {
        // For loops
        for (int i =0;i<20;i++){
            System.out.println(i);
        }

        for (int i = 0; i < 11; i++){
            System.out.println(i);
        }

          for (int i = 0; i<101;i++){
              System.out.println(i);
          }
          While loop
          int i = 0;
          while(i < 11) {
              System.out.println(i);
              i++;
          }

          //do while loop
          int s = 10;
          do {
              System.out.println(s);
              s = s + 1;
          } while(s<18);

         //Practice
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         int sum = 0;
        for(int i =0; i<=n;i++){
            sum = sum +1;
        }
        System.out.println(sum);

          //print table of 2
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int i =1; i<11; i++) {
            System.out.println(i*n);
        }





    }
}