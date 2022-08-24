//Find the Kth Min and Max Element of an array.
//lnjlnljnlnln
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kth_min_max_element {
    public static int KthLargestElement(int arr[],int n ,int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; ++i) {
            maxHeap.add(arr[i]);
        }

        for(int i=1 ; i<k ; i++)
        {
//            System.out.println(maxHeap);
            maxHeap.poll();
        }

        return maxHeap.peek();
    }

        public static int kthSmallestElement(int arr[],int n ,int k)
        {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int i = 0; i < n; ++i) {
                minHeap.add(arr[i]);
            }
            for(int i=1 ; i<k ; i++)
            {
//               System.out.println(minHeap);
              minHeap.poll();
            }
            return minHeap.peek();
    }

   public  static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int arr[] = {3,2,1,5,6,9};
       int arr_size = arr.length;
       int key = 3;
       System.out.println("The "+key+" Smallest Element  is :"+kth_min_max_element.kthSmallestElement(arr,arr_size,key));
       System.out.println("The "+key+" Smallest Element  is :"+kth_min_max_element.KthLargestElement(arr,arr_size,key));
   }
}
