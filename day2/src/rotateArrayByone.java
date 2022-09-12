public class rotateArrayByone {
    public static void rotateArray(int[] arr, int n){
//        int lastElement = arr[n-1];
//        for(int i=n-1;i>=0;i--){
//
//            if((i-1)>=0){
//                arr[i] = arr[i-1];
//            }else {
//                arr[0] = lastElement;
//            }
//
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        int[] newArr = new int[n];
        for(int i=0;i<n;i++){
            newArr[i] = arr[n-(i+1)];
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(newArr[i]+" ");
        }


    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = 5;
        rotateArray(arr, n);
    }
}
