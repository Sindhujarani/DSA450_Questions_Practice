//Find the Maximum and Minimun element of an Array.
public class MaxMin_Of_Array {
    static class pair
    {
        int min;
        int max;
    }
    static pair getMinMax(int arr[],int n)
    {
        pair MinMax = new pair();
        int i;
        /*if there are only one element in array then return it as Max and Min both */
        if(n==1)
        {
            MinMax.max =arr[0];
            MinMax.min =arr[0];
            return MinMax;
        }
        /* if there are more then One elements in array then  initialize Min or Max*/
        if(arr[0]>arr[1])
        {
            MinMax.max = arr[0];
            MinMax.min = arr[1];
        }
        else
        {
            MinMax.max = arr[1];
            MinMax.min = arr[0];
        }
        for(i=2 ; i<n ;i++)
        {
            if (arr[i]>MinMax.max)
            {
                MinMax.max = arr[i];
            }
            else if(arr[i]<MinMax.min)
            {
                MinMax.min = arr[i];
            }
        }
        return MinMax;
    }
    /* Driver program to test the above function*/
    public static void main(String args[])
    {
        int arr[] = {45,66,100,77,83,97,5};
        int arr_size = arr.length;
        pair MinMax = getMinMax(arr,arr_size);// getMinMax function called here;
        System.out.println("The Maximum or largest Element of array is "+MinMax.max);
        System.out.println("The Minimum or Smallest Element of array is "+MinMax.min);
    }
}
