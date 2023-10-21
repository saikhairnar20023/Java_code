import java.util.Scanner;

public class bit_manipulation {
    public static void main(String[] args){
        // get bit
//         int  n=5;//0101;
//         int pos = 2;
//         int bitmask= 1<<pos;
//
//         if((bitmask & n)==0){
//             System.out.println("bit is 0");
//         } else{
//             System.out.println("bit is 1");
//         }

//        Set bit
//        int i=5;//0101;
//        int pos= 1;
//        int bitmask= 1<<pos;
//
//      int newnumber = bitmask | i;
//        System.out.println(newnumber);

//          clear bit
//           int n = 5;
//           int pos =2;
//           int bitmask= 1<<pos;
//
//           int notbitmask= ~(bitmask);
//            int newnumber = notbitmask & n;
//        System.out.println(newnumber);

//        update bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
//        int oper=1;
        int bitmask=1<<pos;


        if (oper==1){
            //set
            int newnumber = bitmask | n;
            System.out.println(newnumber);
        } else {
            //clear
            int newbitmask = ~(bitmask);
            int newnumber = newbitmask & n;
            System.out.println(newbitmask);

        }




    }
}
