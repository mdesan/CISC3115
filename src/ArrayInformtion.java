import java.io.File;
import java.util.Scanner;

public class ArrayInformtion {

    public static void main(String[] args) throws java.io.FileNotFoundException{

        File file = new File( "/home/mike/Desktop/Fall2024/modernProgTecs/numbers.txt" );
        Scanner sc = new Scanner(file);

        double [] arr = new double[findSize(file,sc)];
        fillArray(file, sc, arr.length, arr);

        arrInfo(arr);
    }

    public static int findSize(File file, Scanner sc)throws java.io.FileNotFoundException{

        int size = sc.nextInt();
        return size;
    }

    public static void fillArray(File file, Scanner sc, int size,double[]arr){
        for(int i = 0;i<size;i++){
            arr[i]=sc.nextDouble();
        }

    }

    public static void arrInfo(double[]arr){

        System.out.print("the array {");
        for(int i = 0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.print("} contains " + arr.length + " elements");
        System.out.println();
        System.out.println("the first element in the array is " + arr[0]);
        System.out.println("the last element of the array is " + arr[arr.length-1] + " and is at position " + (arr.length-1));

        if(arr.length%2==0) {
            System.out.println("There is no middle of the array since the array's lenght is even");
        }
        else{
            System.out.println("the middle element of the array is " + (arr[arr.length/2]) + " and is at position " + (arr.length/2));
        }

        double largest = arr[0];
        int index =-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
                index=i;
            }
        }
        System.out.println("the largest element of the array is " + largest + " and is at position " + index);

        double smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
                index=i;
            }
        }
        System.out.println("the smallest element of the array is " + smallest + " and is at position " + index);
    }
}
