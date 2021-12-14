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
            int[] arr = {-10,-3,0,5,9,12};
            Node head = adder(0,arr.length-1, arr);
            
            printer(head);
        }
        private static Node adder(int low, int high, int[] nums) {
            if(low>high) return null;
            
            int mid = low + (high-low)/2;
            Node temp = new Node(nums[mid]);
            temp.left = adder(low, mid-1, nums);
            temp.right = adder(mid+1, high, nums);
            
            return temp;
        }
        private static void printer(Node root) {
            if(null == root) return;
            
            
            printer(root.left);
            System.out.print(root.data + " ");
            printer(root.right);
        }
    
    }