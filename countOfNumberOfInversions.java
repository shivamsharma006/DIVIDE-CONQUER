import java.util.Arrays;

public class countOfNumberOfInversions {
    public static void main(String[] args) {
        int[] arr = {1,5,2,8,3,4};
        int n = arr.length;

        int countOpt = inversionCountOpt(arr, 0, n-1);
        System.out.println("The inversion count of a given array using divide and conquer approach is: "+countOpt);
    }

    public static int inversionCountOpt(int[]arr, int l, int h){
        int count = 0;
        if(l<h){
        int mid = l + (h-l)/2;

        count+=inversionCountOpt(arr,l,mid);
        count+=inversionCountOpt(arr,mid+1,h);
        count+=mergeProcedure(arr,l,mid,h);
        }
        return count;
    }

    public static int mergeProcedure(int[]arr,int l,int mid,int h){
        int swap = 0;
        int[]lsubarray = Arrays.copyOfRange(arr, l, mid+1);
        int[]rsubarray = Arrays.copyOfRange(arr, mid+1, h+1);

        int i=0,j=0,k=l;
        while(i<lsubarray.length && j<rsubarray.length){
            if(lsubarray[i]<=rsubarray[j]){
                arr[k++] = lsubarray[i++];
            }
            else{
                arr[k++] = rsubarray[j++];
                swap += (mid+1) - (l+i);
            }
        }

        while(i<lsubarray.length){
            arr[k++] = lsubarray[i++];
        }
        while(j<rsubarray.length){
            arr[k++] = rsubarray[j++];
        }
        return swap;
    }
}
