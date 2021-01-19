import java.util.*;

class SortNos
{
    private int c_zero = 0;
    private int c_one = 0;
    private int c_two = 0;
        
    public void Sorting(int arr[], int n)
    {
        int i; int k;
        for(i=0 ; i<n ; i++)
        {
            if(arr[i] == 0)
                c_zero++;
            if(arr[i] == 1)
                c_one++;
            if(arr[i] == 2)
                c_two++;            
        }
        
        for(i=0 ; c_zero>0 ; c_zero--)
        {
            arr[i] = 0;
            i++;
        }
        
        for(k = i; c_one>0 ; c_one--)
        {
            arr[k] = 1;
            k++;
        }

        for(i = k ; c_two>0 ; c_two--)
        {
            arr[i] = 2;
            i++;
        }

        for(i=0 ; i<n ; i++)
            System.out.print(arr[i] + " ");         
        System.out.print("\n");
    }

}

class Sort012
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

        SortNos obj = new SortNos();
        System.out.println("The Sorted array is: ");
        obj.Sorting(arr,n);
    }
}
