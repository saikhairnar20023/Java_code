import java.util.*;
public class Functions_ {
    public static int calculatemul(int a,int b){
        return a*b;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of a and b is" + calculatemul(a,b));
    }
}
