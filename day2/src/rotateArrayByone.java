public class rotateArrayByone {
    public static void rotateArray(int[] arr, int n){
        int lastElement = arr[n-1];
        for(int i=n-1;i>=0;i--){

            if((i-1)>=0){
                arr[i] = arr[i-1];
            }else {
                arr[0] = lastElement;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args){
        int[] arr = {1,2,5,4,8};
        int n = 5;
        rotateArray(arr, n);
    }
}
