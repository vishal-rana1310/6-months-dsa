public class linearSearch {
    //linear search recursive approach
    public static int search(int arr[], int size, int key){
        if(size == 0){
            return -1;
        }
        if(arr[size-1] == key){
            return size-1;
        }else {
            int ans = search(arr, size-1, key);
            return ans;
        }
    }
    public static void main(String args []){
        int arr[] = {5,4,6,15,6};
        int size = 5;
        int key = 111;
        int ans = search(arr, size, key);
        if(ans == -1){
            System.out.println("Key is not found");
        }else {
            System.out.println("Key is found at position "+ans);
        }
    }
}
