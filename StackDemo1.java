//Stack implementation using Array
import java.util.Scanner;
public class StackDemo1 {
    static int push(int s[] , int top){
        Scanner sc = new Scanner(System.in);
        if (top == MAX-1){
            System.out.println("Stack Overflow");
            return top;
        }
        top  = top+1;
        System.out.println("Enter the element x:");
        s[top]  = sc.nextInt();
        return top;
    }
    static int pop(int s[] , int top){
        if (top == -1){
            System.out.println("Stack Underflow");
            return top;
        }
        int data = s[top];
        top = top-1;
        System.out.println(data + "is removed from stack");
        return top;
    }
    static void display(int s[],int top){
        if (top<0){
            System.out.println("Stack is Empty!");
        }
        for (int i= top;i>=0;i--){
            System.out.println(s[i]);
        }
        System.out.println();
    }
    static boolean isEmpty(int top){
        return top==-1;
    }
    static boolean isFull(int top){
        return top == MAX-1;
    }
    static final int MAX = 10;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int stack [] = new int[MAX];
        int top = -1;
        while(true)
        {
            System.out.println("*** MENU***");
            System.out.println("0.Exit");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.isEmpty");
            System.out.println("5.isFull");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 0: System.exit(0);
                case 1: top = push(stack,top);
                        break;
                case 2:top = pop(stack,top);
                        break;
                case 3:display(stack,top);
                       break;
                case 4:
                    System.out.println("Stack underflow: "+ isEmpty(top));
                    break;
                case 5:
                    System.out.println("Stack overflow:"+ isFull(top));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}