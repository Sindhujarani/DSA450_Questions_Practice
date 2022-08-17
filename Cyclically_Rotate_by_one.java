//write a program to cyclically rotate an array by One

import java.util.Arrays;

public class Cyclically_Rotate_by_one
{
    static int arr[] = new int[]{1, 2, 3, 4, 5};

    // Method for rotation
    static void rotate()
    {
        int x = arr[arr.length-1], i;
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
    }

    /* Driver program */
    public static void main(String[] args)
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));

        rotate();

        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}


/*
import java.util.Arrays;
import java.util.Scanner;
public class CyclicallyRotateanArray {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the required size of the array ::");
      int size = sc.nextInt();
      int [] myArray = new int[size];
      System.out.println("Enter elements of the array");
      for(int i=0; i< size; i++){
         myArray[i] = sc.nextInt();
      }
      System.out.println("Contents of the array: "+Arrays.toString(myArray));
      int temp = myArray[size-1];
      for(int i = size-1; i>0; i--){
         myArray[i] = myArray[i-1];
      }
      myArray[0] = temp;
      System.out.println("Contents of the cycled array: "+Arrays.toString(myArray));
   }
}
 */