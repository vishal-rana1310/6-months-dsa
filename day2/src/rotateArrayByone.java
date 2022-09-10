public class rotateArrayByone {

    //rotate array by one gfg basic problem
    public static void rotateArray(int[] arr, int n){
        int lastElement = arr[n-1];
        for(int i=0;i<n;i++){

            if((i+1)<n){
                arr[i] = arr[i+1];
            }else {
                arr[0] = lastElement;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args){
        int[] arr = {5,2,3,4,1,7,8};
        int n = 7;
        rotateArray(arr, n);
    }
}
