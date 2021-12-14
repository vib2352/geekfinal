
	import java.util.*;
	import java.util.LinkedList;
	import java.util.Queue;
	class ListNode{
		int data;
		ListNode left,right;
		ListNode(int data)
		{
			this.data=data;
		}
	}

	public class PrintLeafNode{
	   
	     ListNode root;
	     PrintLeafNode()
	     {
	    	 root=null;
	     }
	    public static int count=0;
	    public static int sum=0;
		
		public void inorder(ListNode node)
		{
			if (null==node)
			{
				return;
			}
			count++;
			inorder(node.left);
			System.out.print(node.data+" ");
			sum=sum+node.data;
			inorder(node.right);
		}
		public void preorder(ListNode node)
		{
			if (null==node)
			{
				return;
			}
			System.out.print(node.data+" ");
			preorder(node.left);
			preorder(node.right);
			
		}
		public void postorder(ListNode node)
		{
			if (null==node)
			{
				return;
			}
			
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+" ");
			
		}
		
		public void inorder() {
			inorder(root);
			
			
		}
			public void postorder() {
				postorder(root);
			}
			public void preorder() {
				preorder(root);
			}
		public int getHeight(ListNode node)
		{
			if(null==node)
				return -1;
			int leftDepth=getHeight(node.left);
			int rightDepth=getHeight(node.left);
			if(leftDepth>rightDepth)
				return leftDepth+1;
			else
				return rightDepth+1;
			
		}

		public void leafNode(ListNode node)
		
		{   
			
			
			if(null==node)
			{
				
				return;
			}
			if(node.left==null&& node.right==null)
				System.out.print(node.data+" ");
			
			leafNode(node.left);
			leafNode(node.right);
		}
		public void printKthLevel(ListNode node,int k)
		{
			if(null==node)
			{
				return;
			}
			if(k==0)
			{
				System.out.print(node.data+" ");
			}
			printKthLevel(node.left,k-1);
			printKthLevel(node.right,k-1);
			
		}
		public static int levelSoFar=0;
		public void rightNode(ListNode node,int currLevel)
		{
			if (null==node)
				return;
			if(currLevel>=levelSoFar)
			{
				System.out.print(node.data+" ");
				levelSoFar++;
			}
			rightNode(node.right,currLevel+1);
			rightNode(node.right,currLevel+1);
		}
		public void levelOrder(ListNode node)
		{
			int h=getHeight(root);
			for(int i=0;i<=h;i++)
			{
				printKthLevel(root,i);
				System.out.println();
			}
		}
		public void levelOrderIterative(ListNode node)
		{
			Queue<ListNode>q=new LinkedList<ListNode>();
			q.add(node);
			ListNode temp=null;
			while(!q.isEmpty())
			{
				 temp=q.poll();
				 System.out.print(temp.data+" ");
			
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
			}
		}
		
		
	 
	 public static void main(String[] args)
	 {
		 PrintLeafNode obj=new PrintLeafNode();
		 obj.root=new ListNode(1);
		 obj.root.left=new ListNode(3);
		 obj.root.right=new ListNode(4);
		 obj.root.left.left=new ListNode(5);
		 obj.root.left.right=new ListNode(6);
		 
		 obj.leafNode(obj.root);
		 System.out.println();
		 
		 
		
		 
		 
	 }
	}

}
