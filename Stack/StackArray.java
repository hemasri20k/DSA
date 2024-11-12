package Stack;

import java.util.Scanner;

public class StackArray {
    int top=-1;
    
    void push(int data, int a[])
    {
        
        top++;
        a[top]=data;
        
    }
    void pop(int[] a)
    {
        System.out.println("\nItem popped:" + a[top]);
        top--;
        
    }
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StackArray sa=new StackArray();
        System.out.print("Enter the size of array:");
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            sa.push(a[i],a);
        }
        System.out.print("Items in the stack are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }        
        
        sa.pop(a);

    }
}
