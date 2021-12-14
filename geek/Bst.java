package geek;

public class Bst {
	
	
	    public static class Node {
	        int data;
	        Node left, right;

	        public Node(int data) {
	            this.data = data;
	            left = right = null;
	        }

	        public Node() {

	        }
	    }

	    public Node root;

	    public BST() {
	        root = null;
	    }

	    public void insert(int data) {
	        root = insertRecursive(data, root);
	    }

	    private Node insertRecursive(int data, Node root) {
	        Node temp = new Node(data);
	        if (null == root) {
	            root = temp;
	            return root;
	        } else {
	            Node currentNode = root;
	            Node parentNode = null;

	            while (true) {
	                parentNode = currentNode;
	                if (data < currentNode.data) {
	                    currentNode = currentNode.left;
	                    if (null == currentNode) {
	                        parentNode.left = temp;
	                        return root;
	                    }
	                } else if (data > currentNode.data) {
	                    currentNode = currentNode.right;
	                    if (null == currentNode) {
	                        parentNode.right = temp;
	                        return root;
	                    }
	                }
	            }

	        }
	    }

	    public void printeInOrder() {
	        printerRecursiveInOrder(root);
	    }

	    private void printerRecursiveInOrder(Node root) {
	        if (null == root)
	            return;

	        printerRecursiveInOrder(root.left);
	        System.out.print(root.data + " ");
	        printerRecursiveInOrder(root.right);
	    }

	    public void delete(int data) {
	        root = deleteRecursive(data, root);
	    }

	    private Node deleteRecursive(int data, Node root) {
	        if (root == null)
	            return root;

	        if (data < root.data) {
	            root.left = deleteRecursive(data, root.left);
	        } else if (data > root.data) {
	            root.right = deleteRecursive(data, root.right);
	        } else {

	            if (null == root.left && null == root.right)
	                return null;

	            else if (null == root.left) {
	                return root.right;
	            } else if (null == root.right) {
	                return root.left;
	            } else {
	                root.data = leftMax(root.left);

	                root.left = deleteRecursive(root.data, root.left);

	            }
	        }

	        return root;
	    }
	    private int leftMax(Node root) {
	        int maxVal = root.data;

	        while (null != root.right) {
	            maxVal = root.right.data;
	            root = root.right;
	        }
	        return maxVal;
	    }
	    public boolean searchElement(int data) {
	        if (searchRecursive(data, root))
	            return true;
	        else
	            return false;
	    }
	    private boolean searchRecursive(int data, Node root) {
	        if (root == null) {
	            return false;
	        }
	        if (root.data == data) {
	            return true;
	        } else if (data < root.data) {
	            return searchRecursive(data, root.left);
	        } else {
	            return searchRecursive(data, root.right);
	        }
	    }

	}
	

}
