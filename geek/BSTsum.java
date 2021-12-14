package geek;
import java.util.LinkedList;
import java.util.Queue;

public class BSTsum {
public static class Node{
		
		public int data;
		public Node left;
		public Node right;
		
		public Node() {}
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}

	public static void main(String[] args) {
		Node head = new Node(5);
		head.left = new Node(3);
		head.left.left = new Node(2);
		head.left.right = new Node(4);
		head.right = new Node(6);
		head.right.right = new Node(7);
		
		int low = 6;
		int high = 15;
		
		System.out.println(range(head, low, high));
	}
	private static int range(Node root, int low, int high) {
		
		int sum = 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			if(temp.data>=low && temp.data<=high){
				sum+=temp.data;
			}
			if(null != temp.left && low<temp.data) {
				q.add(temp.left);
			}
			if(null != temp.right && high>temp.data) {
				q.add(temp.right);
			}
		}
		
		return sum;
	}

}

}
