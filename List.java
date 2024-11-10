import java.util.Scanner;
class List{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

public void insertAtBegin(int a)
{
    Node newNode=new Node(a);
    newNode.next=head;
    head=newNode;
}
public void display()
{
    Node h=head;
    while(h!=null)
    {
        System.out.print(h.data + "->");
        h=h.next;
    }
}
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    List l=new List();
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
        l.insertAtBegin(a[i]);
    }
    l.display();
}
}