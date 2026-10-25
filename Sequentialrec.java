import java.util.Scanner;
public class sequentialrec
{
    static int search(int a[],int n,int key,int i)
    {
        if(i==n)
        {
            return -1;
        }

        if(a[i]==key)
        {
            return i;
        }

        return search(a,n,key,i+1);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the element to search : ");
        int key=sc.nextInt();

        int result=search(a,n,key,0);

        if(result==-1)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element found at position "+(result+1));
        }
    }
}