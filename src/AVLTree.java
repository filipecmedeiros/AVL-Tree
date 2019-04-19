public class AVLTree {
        public Node root = null;
        
        public AVLTree () {
            this.root = null;
        }
        
        public boolean isEmpty() {
            return root == null;
        }
        
        public Node getRoot (){
            return this.root;
        }
        
        private static int height (Node n) {
            return n == null ? -1 : n.height;
        }

        private static int max( int a, int b ) {
            return a > b ? a : b;
        }
         
        private int getBalance (Node n) {
        	return height (n.left) - height (n.right);
        }

        
        private static Node rightRotation (Node a) {
            Node b = a.left;
            a.left = b.right;
            b.right = a;
            a.height = max(height(a.left), height(a.right)) + 1;
            b.height = max(height(b.left), a.height) + 1;
	    return b;
        }
        
        private static Node leftRotation (Node a) {
            Node b = a.right;
            a.right = b.left;
            b.left = a;
            a.height = max(height(a.left), height(a.right)) + 1;
            b.height = max(height(b.right), a.height) + 1;
            return b;
        }

        private static Node doubleRightRotation (Node a) {
            a.left = leftRotation (a.left);
            return rightRotation (a);
       }

        private static Node doubleLeftRotation (Node a) {
            a.right = rightRotation (a.right);
            return leftRotation (a);
        }
        
        public boolean insert (int x) {
            root = insert (x, root);
            return true;
        }
        
        private Node insert (int x, Node t) {
            if (t == null){
            	t = new Node (x, null, null);
            }
            else if (x == t.val) System.out.println("This value already exists");
            else if (x<t.val) t.left = insert (x, t.left);
            else if (x>t.val) t.right = insert (x, t.right);
            t = balance (t);
            return t;
        }

		public void remove (int x) {
            root = remove (x, root);
        }
		
        private Node remove (int x, Node t) {
            if (t == null){
            	System.out.println("This value doesn't exists");
            	return null;
            }
            if (x<t.val) {
				t.left = remove(x, t.left);
				System.out.println("Value " + t.left + " removed");
				return balance (t);            	
            }
            else if (x>t.val) {
            	t.right = remove(x, t.right);
            	System.out.println("Value " + t.right + " removed!");
            	return balance (t);
            }
            else{
            	if (t.left == null && t.right == null) {           		
			return null;
            	}
            	if (t.left == null) {          	
			return t.right;            		
            	}
            	if (t.right == null) {
            		System.out.println("Value " + x + " removed");
            		return t.left;
            	}
                else if (t.left != null && t.right != null ){
                    t.val = minRight( t.right ).val;
                    t.right = remove( t.val, t.right);
                    System.out.println("Value " + x + " removed!");
                }
                else
                t = (t.left != null ) ? t.left : t.right;
            	System.out.println("Value " + x + " removed");
                return balance(t);
            }
        }

	    public Node minRight(Node t){
	        if (t.left == null){
	            return t;
	        } 
	        else{ 
	            t = t.left;
	            return minRight(t);
	            }
	        }
	    
	    public int getMax(Node root) {
	        Node maior = root;
	        while (maior.right != null) {
	            maior = maior.right;
	        }
	        System.out.print("Maximum value: " + maior.val);
	        return maior.val;
	    }
	
	    public int getMin(Node root) {
	        Node menor = root;
	        while (menor.left != null) {
	            menor = menor.left;
	        }
	        System.out.print("\nMin value: " + menor.val);
	        return menor.val;
	    }
	
	    public Node balance (Node t) {
	        if (getBalance(t) == 2 ) {
	                if (getBalance (t.left)>0){
	                	System.out.println("\nRight rotation");
	                	t = rightRotation( t );
	                }
	                else{
	                	System.out.println("\nDouble right rotation");
	                	t = doubleRightRotation( t );
	                }
	        }
	        else if (getBalance(t) == -2 ) {
	                if (getBalance(t.right)<0 ){
	                	System.out.println("\nLeft rotation");
	                	t = leftRotation( t );
	                }
	                else{
	                	System.out.println("\nDouble left rotation");
	                	t = doubleLeftRotation (t);
	                }
	        }
	        t.height = max(height(t.left), height(t.right)) + 1;
	        return t;
	    }
        
        public Node search(int el) {
            return search(root,el);
        }
        
        public Node search(Node p, int el) {
            while (p != null) { 
                if (el==p.val){
                	System.out.println("Value " + el + " found"); 
                	return p;
                }
                else if (el<p.val) { 
                	p = p.left;
                }
                else {
                	p = p.right;
                }
            }
            System.out.println("Value " + el + " not found");
            return null;
        }
        public void inOrder() {
            inOrder(root);
        }
        public void inOrder(Node p) {
            if (p != null) {
                 inOrder(p.left);
                 System.out.print(p.val+" - ");
                 inOrder(p.right);
            }
        }
        public void preOrder() {
            preOrder(root);
        }
        public void preOrder(Node p) {
            if (p != null) {
                 System.out.print(p.val + " ");
                 preOrder(p.left);
                 preOrder(p.right);
            }
        }
        public void postOrder() {
            postOrder(root);
        }
        public void postOrder(Node p) {
            if (p != null) {
                 postOrder(p.left);
                 postOrder(p.right);
                 System.out.print(p.val + " ");
            }
        }
        
	    public Node getParent (int el) {
	        Node p = root;
	        Node prev = null;
	        while (p != null && !(p.val==el)) {
	            prev = p;                           
	            if (p.val<el)
	                  p = p.right;
	            else p = p.left;
	        }
	        if (p!=null && p.val==el) return prev;
	        return null;
	    }
	    
	    public void displayTree() {
	    	if (isEmpty()){
	    		System.out.println("Empty tree");
	    		return;
	    	}    		
			String separator = String.valueOf("  |__");
			System.out.println(this.root.val+"("+getBalance(root)+")");
			displaySubTree(root.left,  separator);
			displaySubTree(root.right, separator);
		}
		private void displaySubTree(Node node, String separator) {
			if (node != null) {
				Node father = this.getParent(node.val);
				if (node.equals(father.left) == true) {
					System.out.println(separator+node.val+"("+getBalance(node)+")"+" (LEFT)");
				}else{
					System.out.println(separator+node.val+"("+getBalance(node)+")"+" (RIGHT)");
				}			
				displaySubTree(node.left,  "     "+separator);
				displaySubTree(node.right, "     "+separator);
			}
		}
		
		public int nRotations(Node n, int key) {
			int cont = 0;
			
			while (n != null) {
				if (n.val == key) {
					return cont;
				}
				else if (key < n.val) {
					if (this.getBalance(n) == -1) {
						cont++;
					}
					n = n.left;
				}
				else {
					if (this.getBalance(n) == 1) {
						cont++;
					}
					n = n.right;
				}
			}
			cont=-1;
			
			return cont;
		}


}