import java.util.Scanner;

class Solution
{
    private int min = 9999;
    private int max = -9999;
        
    public void find_min_max(int arr[], int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];            
        }
        
        System.out.println("Minimum Element is: " + min);         
        System.out.println("Maximum Element is: " + max);         
    }
}

class MinMax
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the array: ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Solution obj = new Solution();
        obj.find_min_max(arr,n);
    }
}
