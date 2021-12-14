package geek;

public class Twobstsum {
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
		
		int target = 10;
		System.out.println(findTarget(head, target));
	}
	private static boolean findTarget(Node root, int target) {
		HashSet<Integer> has = new HashSet<>();
		return bf(has, target, root);
	}
	private static boolean bf(HashSet<Integer> has, int target, Node root) {
		if(null == root) return false;
		if(has.contains(target-root.data)) return true;
		has.add(root.data);
		return bf(has, target, root.left)|| bf(has, target, root.right);
	}

}

}
