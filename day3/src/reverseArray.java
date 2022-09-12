public class reverseArray {
    public static void reverse(int[] arr, int size){
        for(int i=0;i<size/2;i++){
            int t = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = t;


        }
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {0,2,3,4,5,6,7,8,10};
        int size = 9;
        reverse(arr, size);
    }
}
