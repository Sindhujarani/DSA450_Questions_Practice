//Find  largest sum contiguous Subarray[v-imp]
import java.util.Scanner;
public class SubArray {
    static int MaxSumArraySum(int a[],int Size)
    {
        int Max_so_far = a[0];
         int Max_ending_here =0;
         for( int i=0 ; i<Size ; i++)
         {
             Max_ending_here = Max_ending_here +a[i];
             if(Max_ending_here < 0)
             {
                 Max_ending_here = 0;
             }
             else if(Max_so_far < Max_ending_here)
             {
                 Max_so_far = Max_ending_here;
             }
         }
//         System.out.println("Maximum contiguous SubArray Sum is:"+Max_so_far);
         return Max_so_far;
    }

    public static void main(String args[])
    {
        int a[] ={-2,-3,4,-1,-2,1,5,-3};
        int n = a.length;
        int max_sum_Array = MaxSumArraySum(a,n);
        System.out.println("Maximum contiguous SubArray Sum is:"+max_sum_Array);

    }
}
