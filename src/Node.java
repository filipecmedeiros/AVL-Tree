public class Node {
    	
    	public int val;
        public Node left, right;
        public int height;
        
        
        public Node (int value) {
            this.val = value;
            this.left = null;
            this.right = null;
            this.height = 0;
        }
        
        public Node (int value, Node left, Node right) {
            this.val = value;
            this.left = left;
            this.right = right;
            height = 0;
        }
}