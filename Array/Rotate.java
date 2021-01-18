import java.util.*;
class Rotate
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array: ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int temp = arr[0];
        for(int i=1 ; i<n ; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        
        System.out.println("Rotated array is: ");
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
