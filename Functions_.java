import java.util.*;
public class Functions_ {
//    public static int calculatemul(int a,int b){
//        return a*b;
//
//    }
    public static void printfactorial(int a){
        if (a<=0){
            System.out.println("invalid number");
            return;
        }

        int factorial =1;
        for(int i=a;i>=1;i--){
            factorial=factorial *i;
        }
        System.out.println(factorial);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt();
       // System.out.println("Product of a and b" +calculatemul(a,b);

        printfactorial(a);
    }


}
