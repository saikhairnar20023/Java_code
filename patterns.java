import java.util.*;
public class patterns {
    public static void main(String[] args) {
     //print pattern
        int n = 4;
        int m = 5;
        //outer loop
        for (int i =1;i<=n;i++){
            //inner loop
            for (int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }


        //second pattern
        int n = 4;
        int m = 5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if (i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }

          // another half pyramid pattern
            int n = 4;
             for (int i=1;i<=n;i++){
                 for (int j=1;j<=i;j++){
                     System.out.print("*");
                 }
                 System.out.println();
             }
              // reverse pyramid
               int n = 4;
               for (int i =n; i>=1; i--){
                   for (int j=1;j<=1;j++) {
                       System.out.print("*");
                   }
                   System.out.println();
               }
    }
}