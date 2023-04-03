import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int front = -1;
        int rear = 0;
        System.out.println("enter 1 for insertion\nenter 2 for deletion\nenter 3 for display");
        while (true) {
            int choice;
            System.out.print("enter choice :");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    front = insertion(arr, front);
                    break;
                case 2:
                    rear = deletion(arr, front, rear);
                    break;
                case 3:
                    show(arr, front, rear);
                    break;
            }
        }
    }

    public static int insertion(int arr[], int front) {
        if (front == 4) {
            System.out.println("cannot insertion");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter elements: ");
            for (int i = front + 1; i < 5; i++) {
                arr[i] = sc.nextInt();
                front++;
            }
        }
        return front;
    }

    public static int deletion(int arr[], int front, int rear) {
        System.out.println("deleted element:" + arr[rear]);
        rear++;
        return rear;
    }

    public static void show(int arr[], int front, int rear) {
        if (front == -1) {
            System.out.println("cannot display");
        } else {
            for (int i = rear; i <= front; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}