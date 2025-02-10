import java.util.Stack;

class QueueStack {
    private Stack<Integer> stack1;  // Primary stack
    private Stack<Integer> stack2;  // Temporary stack

    public QueueStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation (O(1))
    public void enqueue(int value) {
        stack1.push(value);
    }

    // Dequeue operation (O(n) in worst case)
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek operation to get front element (O(n) worst case)
    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueStack queue = new QueueStack();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println("Dequeued: " + queue.dequeue());  // Output: 10
        System.out.println("Peek: " + queue.peek());  // Output: 20
        
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue());  // Output: 20
        System.out.println("Dequeued: " + queue.dequeue());  // Output: 30
    }
}
