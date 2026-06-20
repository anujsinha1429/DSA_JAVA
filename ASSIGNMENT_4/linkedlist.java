import java.util.Scanner;
class Node{
    protected int regd_no;
    protected float mark;
    protected Node next;
}

public class linkedlist {
public static Node create (Node start){
    Scanner sc=new Scanner(System.in);
    Node new_node=new Node();
    System.out.println("Enter the registration number and mark:");
    new_node.regd_no=sc.nextInt();
    System.out.println("Enter the mark:");
    new_node.mark=sc.nextFloat();
    new_node.next=null;
    if (start==null){
        start=new_node;
    }
    else{
        Node temp=start;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }
    return start;
}
public static void display(Node start){
    Node temp=start;
    while(temp!=null){
        System.out.println(temp.regd_no+" "+temp.mark);
        temp=temp.next;
    }
}
public static Node InsBeg(Node start){
    Scanner sc=new Scanner(System.in);
    Node new_node=new Node();
    System.out.println("Enter the registration number and mark:");
    new_node.regd_no=sc.nextInt();
    System.out.println("Enter the mark:");
    new_node.mark=sc.nextFloat();
    new_node.next=null;
    if (start==null){
        start=new_node;
    }
    else{
        new_node.next=start;
        start=new_node;
    }
    return start;
}
public static Node Insend(Node start){
    Scanner sc=new Scanner(System.in);
    Node new_node=new Node();
    System.out.println("Enter the registration number and mark:");
    new_node.regd_no=sc.nextInt();
    System.out.println("Enter the mark:");
    new_node.mark=sc.nextFloat();
    new_node.next=null;
    if (start==null){
        start=new_node;
    }
    else{
        Node temp=start;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }
    return start;
}

public static void main(String[] args) {

    Node start = null;

    for(int i = 0; i < 5; i++) {
        start = create(start);
    }

    display(start);
}
}
