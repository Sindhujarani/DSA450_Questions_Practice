//Find Duplicate in an array of N+1 integers. Space Complexity O(n) ,Time Conplexity = O(1);
import java.util.ArrayList;
import java.util.List;
public class Duplicates_in_Array {
   public  static List<Integer> FindDuplicates(int []arr)
    {
        List<Integer> res = new ArrayList<Integer>();
        for( int i=0 ; i<arr.length ; ++i)
        {
            int index = Math.abs(arr[i])-1;
              if(arr[index] < 0)
                 {
                    res.add(Math.abs(arr[i]));
                 }
              arr[index] = -arr[index];
        }
        return res;
    }
    //Main Function.
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,3,5,6,1};
        System.out.println("The duplicate element is " + FindDuplicates(arr));
    }
}
//1,2,3,4,5,6,3-----> output Should be -->3
//4,3,2,7,8,2,3,1--->output should be -->[3,2]
/*//By the approach of linklist Cyclic method. Time Complexity = O(n) ,Space Conmplexity = O(1).
    public class Duplicates_in_Array {
        public static int FindDuplicates(int[] nums)
        {
            int slow = nums[0];
            int fast = nums[0];
            do
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);

            fast = nums[0];
            while (slow != fast)
            {
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }
        //Main Function.
        public static void main(String args[])
        {
            int arr[] = {1,2,3,4,5,6,3};
            System.out.println("The duplicate element is " + FindDuplicates(arr));
        }
    }

 */






