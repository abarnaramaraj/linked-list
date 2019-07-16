/*package whatever //do not write package name here */
import java.lang.*;
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d){data=d; next=null;}
}
class linkedlist
{
    public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        insertlist list=new insertlist();
	        int n=sc.nextInt();
	        sc.nextLine();
	        for(int i=0;i<n;i++)
	        {
	            int s1=sc.nextInt();
	            int s2=sc.nextInt();
	            if(s2==0)
	                list.insertAtBeginning(s1);
	            else
	                list.insertAtend(s1);
	        }
	        list.printlist();
	    }
	}
}
class insertlist
{
	Node head;
    void insertAtBeginning(int x)
    {
        Node new_node=new Node(x);
        new_node.next=head;
        head=new_node;
    }
    void insertAtend(int x)
    {
        Node new_node=new Node(x);
        if(head==null)
        {
            head=new_node;
            return;
        }
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;
        return;
    }
    void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
           System.out.print(temp.data+" ");
           temp=temp.next;
        }
        System.out.println();
    }
}
