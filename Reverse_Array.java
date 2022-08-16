import java.util.Scanner;
public class Reverse_Array {
    public static void reverse_array(int arr[],int start,int end)
   /* {
        int temp=0;
        //logic implementation using for loop to reverse the Number array.
        for(int i=0 ; arr[start]<arr[end] ; i++ )
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }*/
    {
        int temp = 0 ;
        //this is the same approach or logic using while loop To Reverse array,
        while(arr[start]<arr[end])
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //driver program to test the above Function.
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        System.out.println("Enter array elements.");
        for(int i=0 ; i<arr_size ; i++ )
        {
             arr[i] =  sc.nextInt();
        }
        System.out.println("Before Reverse The Array is:");
        for(int i=0 ; i<arr_size ; i++)
        {
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        //calling function for reverse the array;
        reverse_array( arr ,0, arr_size-1);

        System.out.println("After Reverse The Array is:");
        for(int i=0 ; i<arr_size ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
