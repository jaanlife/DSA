import java.util.Stack;

class StackQueue {
    private Stack<Integer> stack;

    public StackQueue() {
        stack = new Stack<>();
    }

    // Enqueue operation (Push to stack)
    public void enqueue(int value) {
        stack.push(value);
    }

    // Dequeue operation using recursion
    public int dequeue() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int top = stack.pop();

        if (stack.isEmpty()) {
            // This is the first inserted element (front of queue)
            return top;
        } else {
            // Recursively remove the last element
            int front = dequeue();
            // Push back the popped elements
            stack.push(top);
            return front;
        }
    }

    // Peek (Get front element without removing it)
    public int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int top = stack.pop();
        int front;

        if (stack.isEmpty()) {
            front = top;
        } else {
            front = peek();
        }

        stack.push(top);
        return front;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();

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
