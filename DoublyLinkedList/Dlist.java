package DoublyLinkedList;
import java.util.Scanner;
public class Dlist {
    Node head;
    public class Node
    {
        Node next;
        Node prev;
        int data;
        Node(int data)
        {
            this.data=data;
            this.next=next;


        }
    }
    public void insertAtBegin(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            newNode.next=head;
        
        head=newNode;   
        }
        else{
            newNode.next=head;
        head.prev=newNode;
        head=newNode;
        }
        
    }
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            insertAtBegin(data);
        }
        else{
            Node c=head;
            while(c.next!=null)
            {
                c=c.next;
            }
            newNode.prev=c.next;
            c.next=newNode;
        }
    }
    public void insertAtPos(int data, int p)
    {
        Node newNode=new Node(data);
            Node c=head;
            int count=1;

            while(count<p-1)
            {
                c=c.next;
                count++;
            }
            Node n=c.next;
            newNode.prev=c;
            c.next=newNode;
            newNode.next=n;
            n.prev=newNode;
        
    }
    public void display()
    {
        Node c=head;
        while(c!=null)
        {
            
            System.out.print(c.data + "<->");
            c=c.next;
        }

    }
    public void deleteFirst()
    {
        Node c=head.next;
        c.prev=null;
        head.next=null;
        head=c;
        
    }
    public void deleteEnd()
    {
        Node c=head;
        while(c.next.next!=null)
        {
            c=c.next;
        }
        c.next.prev=null;
        c.next=null;
        
    }
    public void deletePos(int p)
    {
        Node c=head;
        int count=1;
        while(count<p-1)
        {
            c=c.next;
            count++;
        }
        Node n=c.next.next;
        c.next=n;
        n.prev=c;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Dlist l=new Dlist();
        int num=0;
        System.out.print("Enter the size of list:");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            num=num+1;
            l.insertAtBegin(a[i]);
            
        }
        System.out.print("Number of elements=" + num + "\n");
        System.out.print("Enter the position:");
        int p=s.nextInt();
        System.out.print("Enter the element to insert:");
        int k=s.nextInt();
        if(p>=num+2)
        {
            System.out.println("Invalid position");
        }
        
        else{
            l.insertAtPos(k,p);
            num++;
        }
        
        l.display();
        System.out.println("\n Number of elements after inserting a new element=" + num + "\n");
        l.deletePos(p);
        l.display();
        
    }
    
}
