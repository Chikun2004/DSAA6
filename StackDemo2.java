import java.util.Scanner;

//STACK IMPLEMENTATION USING LINKED LIST
class Node{
    int info;
    Node next;
}
public class StackDemo2 {
    static Node push(Node top){
        Scanner sc = new Scanner(System.in);
        Node newStack = new Node();
        System.out.println("Enter the element x:");
        newStack.info = sc.nextInt();
        newStack.next = top;
        top = newStack;
        return top;
    }
    static Node pop(Node top){
        if (top==null){
            System.out.println("Stack underflow");
            return top;
        }
        int data = top.info;
        System.out.println(data+"is removed from stack");
        top = top.next;
        return top;
    }
    static void display(Node top){
        if (top==null){
            System.out.println("Stack underflow");
        }
        Node temp = top;
        while (temp!=null){
            System.out.println(temp.info);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;
        while(true)
        {
            System.out.println("*** MENU***");
            System.out.println("0.Exit");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}