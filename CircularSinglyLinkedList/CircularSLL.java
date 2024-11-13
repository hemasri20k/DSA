package CircularSinglyLinkedList;
import java.util.Scanner;
public class CircularSLL {
    Node last;
    public class Node{
        Node next;
        int data;
        public Node(int data)
        {
            this.data=data;
        }
    }
    /*public void createElements()
    {
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        last=fourth;
    }*/
    public void display()
    {
        if(last==null)
        {
            return;
        }
        Node c=last.next;
        while(c!=last)
        {
            System.out.print(c.data + " ");
            c=c.next;
        }
        System.out.print(c.data);
    }
    public void insertBegin(int data)
    {
        Node newNode=new Node(data);
        if(last==null)
        {
            newNode.next=newNode;
            last=newNode;
        }
        
        newNode.next=last.next;
        last.next=newNode;

    }
    public static void main(String[] args) {
        CircularSLL cl=new CircularSLL();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            cl.insertBegin(a[i]);
        }
        

        cl.display();
        System.out.println();
        cl.insertBegin(10);
        cl.display();
        
        
    }
}