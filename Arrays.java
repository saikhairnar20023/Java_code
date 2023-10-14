import java.util.Scanner;

public class Arrays {
    public static void main (String[] args) {
         array declaration
        int[] marks = new int [4];
//        int marks[]=new int [4];
        marks[0]=97;
        marks[1]=96;
        marks[2]=92;
        marks[3]=89;
        System.out.println(marks[3]);
        System.out.println(marks[2]);
        System.out.println(marks[1]);

         for (int i=0;i<=3;i++){
             System.out.println(marks[i]);
         }

        //user input array

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
         int[] numbers =new int[size];
//       input
         for (int i=0;i<size;i++){
             numbers[i]=sc.nextInt();
         }
         int x =sc.nextInt();
//         output
         for (int i=0;i<numbers.length;i++){
             if (numbers[i]==x) {
                 System.out.println("X found at index:"+i);
             }

         }









    }
}
