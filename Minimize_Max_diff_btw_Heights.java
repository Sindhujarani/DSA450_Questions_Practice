//Minimize Maximum Difference Between Heights.[V.IMP]
import java.util.Arrays;
public class Minimize_Max_diff_btw_Heights {
    public static int getMinDiff(int[] arr, int n, int k)
    {
        Arrays.sort(arr);
        int Max_h = arr[n-1];
        int Min_h = arr[0];
        int res = (Max_h)-(Min_h);

        for(int i=0 ; i<n-1 ; i++)
        {
            Max_h = Math.max(arr[n-1]-k , arr[i]+k);
            Min_h = Math.min(arr[0]+k,arr[i+1]-k);

            res = Math.min(res,Max_h-Min_h);
        }
        return res;
    }
    public static void main(String args[])
    {
         int arr[] ={1,5,15,10};
        int m = arr.length;
        int k = 3;
        System.out.println("Maximum Difference Between Heights is :"+getMinDiff(arr,m,k));
    }
}
