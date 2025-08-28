/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class AVL{
    
    public TreeNode root;
    
    public void insert(int val){
        root=insert(val,root);
    }
    public TreeNode insert(int val,TreeNode node){
        if(node==null){
            node=new TreeNode(val);
            return node;
        }
        if(val>node.val){
            node.right=insert(val,node.right);
        }
        if(val<node.val){
            node.left=insert(val,node.left);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        
        return rotate(node);
        
    }
    
    public TreeNode rotate(TreeNode node){
        if(height(node.left)-height(node.right)>1){
            if(height(node.left.left)-height(node.left.right)>0){
                return rightrotate(node);
            }
             if(height(node.left.left)-height(node.left.right)<0){
                 node.left=leftrotate(node.left);
                 return rightrotate(node);
            }
        }
         if (height(node.left) - height(node.right) < -1) {
    if(height(node.right.left) - height(node.right.right) < 0) {
        return leftrotate(node);
    }
    if(height(node.right.left) - height(node.right.right) > 0) {
        node.right = rightrotate(node.right);
        return leftrotate(node);
    }
}
        
        return node;
    }
    
    public TreeNode rightrotate(TreeNode p){
        TreeNode c=p.left;
        TreeNode t=c.right;
        
        c.right=p;
        p.left=t;
        
        p.height=Math.max(height(p.left),height(p.right))+1;
         c.height=Math.max(height(c.left),height(c.right))+1;
         
         return c;
    }
     public TreeNode leftrotate(TreeNode c){
        TreeNode p=c.right;
        TreeNode t=p.left;
        
        p.left=c;
        c.right=t;
        
        p.height=Math.max(height(p.left),height(p.right)+1);
         c.height=Math.max(height(c.left),height(c.right)+1);
         
         return p;
    }
    
    public int height(TreeNode node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    
   
    
    
    class TreeNode{
        int val;
        int height;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int val){
            this.val=val;
            
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		AVL avl=new AVL();
		for(int i=0;i<1000;i++){
		    avl.insert(i);
		}
		System.out.println(avl.height(avl.root));
	}
}
