import java.awt.Point;
import java.util.Scanner;
public class PointDemo {

    public static void main (String[] args){


//        //1
//        String a1 = "q.w.e..r.t..y//11";
//        String a2 = a1.replace(".",",");
//        System.out.println(a2);
//
//        //2
//        String b1 = "   n  ";
//        String b2 = b1.replace("\t","    ");
//        System.out.println(b2);
//
//        //3
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int count=0;
//        for(int i =0;i<s.length();i++){
//            if(s.charAt(i)=='s'){
//                count++;
//            }
//        }
//        System.out.println(count);
//

        int []arr = {1,2,3,4,5};
        int []arr2 = new int[5];

        makeArrFake(arr,arr2);

        for(int i =0;i<arr.length;i++){
            System.out.println(arr2[i]);
        }

        makeArrReal(arr,arr2);

        for(int i=0;i< arr.length;i++){
            System.out.println(arr2[i]);
        }

    }
    public static void makeArrFake(int[]arr, int[]arr2){
        arr2=arr;
    }

    public static void makeArrReal(int[]arr,int[]arr2){
        for(int i =0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
    }
}
