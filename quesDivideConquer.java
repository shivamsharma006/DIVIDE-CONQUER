/*
QUES-1:- Given an array where all its elements are sorted in increasing order except two swapped elements, sort it
in linear time. Assume there are no duplicates in the array.

INPUT: arr[] = [3, 8, 6, 7, 5, 9, 10]
OUTPUT:- arr[] = [3, 5, 6, 7, 8, 9, 10]
 */
public class quesDivideConquer {
    public static void main(String[] args) {
        int arr[] = {3, 8, 6, 7, 5, 9, 10};
        int n = arr.length;
        sortArr(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortArr(int[]arr,int n){
        if(n<=1){
            return;
        }
        int x = -1;
        int y = -1;
        int prev = arr[0];
        for(int i=1; i<n; i++){
            if(prev>arr[i]){
                if(x==-1){
                    x = i-1;
                    y = i;
                }
                else{
                    y = i;
                }
            }
            prev = arr[i];
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
