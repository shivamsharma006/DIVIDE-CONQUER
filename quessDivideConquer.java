/*
 Q2. Given an array of positive and negative integers, segregate them in linear time and constant
space. The output should print all negative numbers, followed by all positive numbers.
INPUT: arr[] = {19, -20, 7, -4, -13, 11, -5, 3}
OUTPUT: arr[] = {-20 ,-4, -13, -5, 19 ,11 ,3, 7}
 */
public class quessDivideConquer {

    public static void partition(int[]arr, int s, int e){
        int pi_index = s;
        for(int i=s; i<e; i++){
            if(arr[i]<0){
                //swap with pivot index
                int temp = arr[pi_index];
                arr[pi_index] = arr[i];
                arr[i] = temp;
                pi_index++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {19, -20, 7, -4, -13, 11, -5, 3};
        int n = arr.length;
        
        partition(arr,0,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
