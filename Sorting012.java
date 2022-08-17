//Write a program to sort an array only consisting of 0,1,2 without using any sorting algo(means use swap).
import java.util.Scanner;
public class Sorting012 {

    public static void Sort012(int arr[],int n)
    {
        int l=0,h=n-1,m=0;
        while(m<=h)
        {
            if(arr[m]==0)
            {
                swap(arr,m,l);
                m++;
                h++;
            }
            else if (arr[m] == 1)
            {
                m++;
            }
            else
            {
                swap(arr,m,h);
                h--;
            }
        }
    }

    public
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //main function.
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array:");
       int arr_size = sc.nextInt();

        int arr[] = new int[arr_size];//declering an array

        System.out.println("Enter Array elements:");
        for(int i=0 ; i<arr_size ; i++ )
        {
            arr[i] =  sc.nextInt();
        }

        //calling function.
        Sort012( arr ,arr_size);

        System.out.println("After sorting the array is");
        for(int i=0 ; i<arr_size ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
