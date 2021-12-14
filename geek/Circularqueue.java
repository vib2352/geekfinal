package geek;

public class Circularqueue {
	 int SIZE = 5;
	    int front, rear;
	    int queue[] = new int[SIZE];

	    CircularQueue() {
	        front = -1;
	        rear = -1;
	    }

	    boolean isFullQueue() {
	        if (front == 0 && rear == SIZE - 1) {
	            return true;
	        }
	        if (front == rear + 1) {
	            return true;
	        }
	        return false;
	    }

	    boolean isEmptyQueue() {
	        if (front == -1)
	            return true;
	        else
	            return false;
	    }

	    void addQueue(int value) {
	        if (isFullQueue()) {
	            System.out.println("Queue is full");
	        } else {

	            if (front == -1)
	                front = 0;

	            rear = (rear + 1) % SIZE;

	            queue[rear] = value;
	            System.out.println("Element " + value + " is inserted successfully");
	        }
	    }

	    void deQueue() {
	        int value;

	        if (isEmptyQueue()) {
	            System.out.println("The Queue is empty.. ");
	        } else {
	            value = queue[front];

	            if (front == rear) {
	                front = -1;
	                rear = -1;
	            } else {

	                front = (front + 1) % SIZE;
	            }
	        }
	    }

	    void displayQueue() {
	        int i;
	        if (isEmptyQueue()) {
	            System.out.println("The Queue is Empty");
	        } else {
	            System.out.println("Front :  " + front);
	            System.out.println("Elements of the Queue");
	            for (i = front; i != rear; i = (i + 1) % SIZE)
	                System.out.print(queue[i] + " ");
	            System.out.println(queue[i]);
	            System.out.println("Rear : " + rear);
	        }
	    }

	    public static void main(String[] args) {

	        CircularQueue que = new CircularQueue();

	    
	        que.addQueue(10);
	        que.addQueue(24);
	        que.addQueue(33);
	        que.addQueue(67);
	        que.addQueue(22);
	        que.addQueue(900);
	        que.addQueue(867);
	        que.displayQueue();
	    }
	}

}
