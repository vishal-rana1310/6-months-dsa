public class reverseArray2 {
    //reverse array in groups
    public static void reverseInGroups(int[] arr, int size, int k){
        for(int i=0;i<size;i+=k){
            int left = i;
            int right =i+k-1;
            if(right >= size){
                right = size-1;
            }

            while (left < right)
            {
                int t=arr[left];
                arr[left]=arr[right];
                arr[right]=t;
                left+=1;
                right-=1;
            }

        }
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int size = 8;
        int k = 3;
        reverseInGroups(arr,size,k);
    }
}
