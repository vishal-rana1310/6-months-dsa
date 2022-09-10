import java.util.*;
public class arrays {
 public static void main(String[] args){
     minMax obj = new minMax();
     obj.getMinMax();
 }
}
class minMax {
    void getMinMax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter all the elements:");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //printing array
        System.out.print("Your array is: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        //finding min and max of in the array
        int min = arr[0];
//        int max = arr[0];
//        for (int j : arr) {
//            if (j < min) {
//                min = j;
//            }
//            if (j > max) {
//                max = j;
//            }
//        }
//        System.out.println("Minimum number in the array is: "+min);
//        System.out.println("Maximum number in the array is: "+max);
        int count = 0;
        for (int i=0; i< arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                count = 1;
            }
        }
        if(count < 1){
            System.out.println("Array is sorted.");
        }else {
            System.out.println("Array is not sorted.");
        }
    }
}

