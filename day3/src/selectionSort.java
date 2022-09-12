public class selectionSort {
    //selection sort
    public static void sort(int[] arr, int size){
        for(int i=0;i<size;i++){
            int k = i+1;
            int smallest = arr[i];
            int indexOfSmallest = i;
            while (k<size){
                if(smallest>arr[k]){
                    smallest = arr[k];
                    indexOfSmallest = k;
                }
                k++;
            }
            int t = arr[i];
            arr[i] = smallest;
            arr[indexOfSmallest] = t;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int[] arr = {7,-8,-3,11,2};
        int size = 5;
        sort(arr, size);
    }
}
