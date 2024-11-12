package Stack;

import java.util.Scanner;

public class StackList {
    Node top;
    public class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
        }
    }
    public void push(int data)
    {
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }
    public void pop()
    {
        
        Node c=top;
        while(c.next.next!=null)
        {
            c=c.next;
        }
        c.next=null;
    }
    void display()
    {
        Node c=top;
        while(c!=null)
        {
            
            System.out.print(c.data + " ");
            c=c.next;
        }
    }
    public static void main(String[] args) {
        StackList l=new StackList();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            l.push(a[i]);
        }
        l.display();
        l.pop();
        System.out.println();
        l.display();
    }
}
