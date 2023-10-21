public class String_buuilder {
    public static void main (String[] args){
//        StringBuilder sb= new StringBuilder(("Sai"));
//        System.out.println(sb);



//char at index 0
//        System.out.println(sb.charAt(0));
//
        //set char at index 0
//        sb.setCharAt(0,'t');
//        System.out.println(sb);
//
//        sb.insert(1,'i');
//        System.out.println(sb);


        //delete
//        sb.delete(0,1);
//        System.out.println(sb);

         //append
//        sb.append("khairnar");
//        System.out.println(sb);

          //reverse
        StringBuilder sc= new StringBuilder("hello");

        for (int i=0;i<sc.length()/2;i++){
            int front = i;
            int back = sc.length()-1-i;
            char frontchar = sc.charAt(front);
            char backchar = sc.charAt(back);

            sc.setCharAt(front,backchar);
            sc.setCharAt(back,frontchar);

        }

    }
}
