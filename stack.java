
import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int top = -1;
        System.out.println("enter 1 for push\nenter 2 for pop\nenter 3 for display");
        while (true) {
            int choice;
            System.out.print("enter choice :");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    top = push(arr, top);
                    break;
                case 2:
                    top = pop(arr, top);
                    break;
                case 3:
                    show(arr, top);
                    break;
            }
        }
    }

    public static int push(int arr[], int top) {
        if (top == 4) {
            System.out.println("cannot push");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter elements: ");
            for (int i = top + 1; i < 5; i++) {
                arr[i] = sc.nextInt();
                top++;
            }
        }
        return top;
    }

    public static int pop(int arr[], int top) {
        if (top == -1) {
            System.out.println("cannot pop");
        } else {
            System.out.println("popped element:" + arr[top]);
            top--;
        }
        return top;
    }

    public static void show(int arr[], int top) {
        if (top == -1) {
            System.out.println("cannot display");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}