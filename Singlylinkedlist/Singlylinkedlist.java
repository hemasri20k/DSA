package Singlylinkedlist;
import java.util.Scanner;
class List
{
    Node head;
    public class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            
        }
    }
    public void insertAtBegin(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        
    }
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        Node c=head;
        
        while(c.next!=null)
        {
            c=c.next;
        }
        c.next=newNode;
    }
    public void insertAtPos(int data, int p)
    {
        Node c=head;
        Node newNode=new Node(data);
        int count=1;
        while(count<p-1)
        {
            c=c.next;
            count++;
        }
        Node n=c.next;
        c.next=newNode;
        newNode.next=n;


    }
    
    public void display()
    {
        Node cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data + "->");
            cur=cur.next;
        }
System.out.println();
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        List l=new List();
        System.out.println("Enter the size of aray:");
        int n=s.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            l.insertAtBegin(a[i]);
            
        }
        l.display();
        l.insertAtEnd(8);
        l.display();
        l.insertAtPos(9,4);
        l.display();
        
        
    }
}
