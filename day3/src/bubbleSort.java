public class bubbleSort {
    public static void sort(int[] arr, int size){
        for(int i=0;i<size-1;i++){
            for (int j=0;j<size-i-1;j++){
                int left = j;
                int right = j+1;

                if(arr[left]>arr[right]){
                    int t = arr[right];
                    arr[right] = arr[left];
                    arr[left] = t;
                }


            }
        }
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int[] arr = {7,2,30,-10,-12};
        int size = 5;
        sort(arr,size);
    }
}
