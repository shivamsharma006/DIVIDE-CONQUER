public class quickSort {
    public static void main(String[] args) {
        int[] arr = {50, 30, 70, 90, 10, 34, 89, 98, 13};
        int n = arr.length; 

        System.out.println("Array before sorting is: ");
        printArr(arr,n);

        quickSortAlgo(arr,0,n-1);

        System.out.println("Array after sorting is: ");
        printArr(arr,n);

    }

    public static void printArr(int[]arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void quickSortAlgo(int[]arr,int l, int h){
        if(l<h){
            // 1. Divide the array into two subproblems
        int m = partition(arr,l,h);
        // 2. Conquer the subproblems via the recursion
        quickSortAlgo(arr, l, m-1);
        quickSortAlgo(arr, m+1, h);
        }
    }

    public static int partition(int[]arr,int l,int h){
        int i=l;
        int pivot = arr[l];
        for(int j=l+1; j<=h; j++){
            if(arr[j]<=pivot){
                //swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
         // swap (arr[l], arr[i])
        // to get the correct position of the pivot element
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        return i;
    }
}
