class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    // Push element x onto stack
    public void push(int x) {
        q.add(x);
        // Rotate the queue to make x the front
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }

    // Removes the element on top of the stack
    public int pop() {
        return q.remove();
    }

    // Get the top element
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty
    public boolean empty() {
        return q.isEmpty();
    }
}
