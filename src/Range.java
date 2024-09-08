public class Range {

    public static void main(String[] args){
       int[]arr = range(4);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int [] range(int n1, int n2){
        int[]arr=new int[n2-n1];
        int index =0;
        for(int i=n1; i<n2;i++){
        arr[index]=i;
        index++;
        }
        return arr;
    }

    public static int[] range(int num){

      return range(0,num);

    }
}

