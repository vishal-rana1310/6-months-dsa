public class binarySearch {
    public static int binSearch(int arr[], int low, int high, int key){
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(key > arr[mid]){
                low = mid+1;
            }else {
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args []){
        int arr[] = {2,4,6,8,10,14};
        int low = 0;
        int high = arr.length-1;
        int key = 1;
        int ans = binSearch(arr,low,high,key);
        if(ans == -1){
            System.out.println("Item not found");
        }else {
            System.out.println("Item is found at: "+ ans);
        }
    }
}
