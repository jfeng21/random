/*
using recursive to sum all the node val of Binary Tree
*/

public class SumNodeTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeNode n = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        n.left = l;
        n.right = r;
        l.left = new TreeNode(4);
        
        int sum = sum(n);
        System.out.println(sum);
        
        
    }
    static int sum(TreeNode node){
    if(node ==null) return 0;
       int temp = 0;
       temp+= sum(node.left);
       temp+= sum(node.right);
       temp+= node.val;
       return temp;
          
    }
    
}

public class TreeNode {
    TreeNode left, right,parent;
    int val;
    
    public TreeNode(int val){
    this.val = val;

    }
    public int getVal(){
    return this.val;
    }
    
    public TreeNode leftChild(){
    if(this.left!=null)
     return this.left;
    return null;
    }
    
    public TreeNode rightChild(){
     if(this.right!=null)
     return this.right;
    return null;
    }
    
    public String toSTring(){
    String s = "";
    if(left!=null){
    s = "("+left.toSTring() +")";
    }
    s = s+val;
     if(right!=null){
    s = ""
            + "("+right.toSTring() +")";
    }
     return s;
    }
}

