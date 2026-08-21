class MyCircularQueue {
    private int[] data;
    private int front;
    private int rear;
    private int count;
    private int capacity;

    public MyCircularQueue(int k) {
        data = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Insert an element into the circular queue
    public boolean enQueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        data[rear] = value;
        count++;
        return true;
    }

    // Delete an element from the circular queue
    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        count--;
        return true;
    }

    // Get the front item
    public int Front() {
        if (isEmpty()) return -1;
        return data[front];
    }

    // Get the last item
    public int Rear() {
        if (isEmpty()) return -1;
        return data[rear];
    }

    // Check if the circular queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if the circular queue is full
    public boolean isFull() {
        return count == capacity;
    }
}
