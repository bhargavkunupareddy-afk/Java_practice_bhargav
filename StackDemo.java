
class StackDemo {
    int[] arr;
    int top, size;

    StackDemo(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full. We cannot add more.");
            return;
        } else {
            top++;
            arr[top] = value;
            System.out.println("New element is pushed: " + value);
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. We cannot remove.");
            return -1;
        } else {
            int value = arr[top];
            top--;
            return value;
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return arr[top];
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return true;
        } else {
            return false;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Elements cannot be fetched as stack is empty.");
            return;
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        StackDemo stack = new StackDemo(5);

        stack.push(20);
        stack.push(45);
        stack.push(78);

        stack.display();

        stack.push(34);
        stack.push(56);

        stack.push(90);   // Stack Full

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.display();
    }
}
