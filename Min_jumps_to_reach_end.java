//Minimum Numbers of jumps to reach end of an array.
import java.util.Scanner;
public class Min_jumps_to_reach_end {
    public static int Min_jumps(int arr[],int n)
    {
        if(n<=1)
        {
            return 0;
        }
        if(arr[0]==0)
        {
            return -1;
        }

        int MaxReach = arr[0];
        int step =arr[0];
        int jump = 1;

        for(int i=0 ; i<n ; i++)
        {
            if(i == n-1)
            {
                return jump;
            }
            MaxReach =Math.max(MaxReach,i+arr[i]);
            step--;
            if(step == 0)
            {
                jump++;
            }
            if(i>=MaxReach)
            {
                return -1;
            }
            step = MaxReach - i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        //declaring an array which is 1D;
        int arr[] = new int[n];
        System.out.println("Enter Array elements");
        for( int m=0 ; m<n ;m++)
        {
            arr[m]=sc.nextInt();
        }
        System.out.println("Minimum Number of jumps Required to reach at the End of Array is "+Min_jumps_to_reach_end.Min_jumps(arr,n));
    }
}
