/*
1. using recursive to sum all the node val of Binary Tree
2. check balanced
3. convert array to BST
*/

public class SumNodeTree {

    public static void main(String[] args) {
        // sum nodes
        
        TreeNode n = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        n.left = l;
        n.right = r;
        l.left = new TreeNode(4);
        
        int sum = sum(n);
        System.out.println(sum);
        
        //convert arry to BST
        int array[] = new int[]{1,2,3,4,5,6,7,8,9};
        int len = array.length;
        TreeNode root = sortedArrayToBST(array, 0, len-1);
        System.out.println(root.val);
        
        
    }
    //sum nodes val
    static int sum(TreeNode node){
    if(node ==null) return 0;
       int temp = 0;
       temp+= sum(node.left);
       temp+= sum(node.right);
       temp+= node.val;
       return temp;
          
    }
    
}

//checkBalance
    
    static int checkBalance(TreeNode node){
          if(node ==null) return 0;
              
          int leftHeight = checkBalance(node.left);
           if(leftHeight == -1) return -1;
           
           int rightHeight = checkBalance(node.right);
           if(rightHeight == -1) return -1;
           
           if(Math.abs(leftHeight - rightHeight)>1)
                   return -1;
           return(Math.max(leftHeight, leftHeight)+1);
    }
    
    //convert array to BST
      static TreeNode sortedArrayToBST(int[] num){
      if(num.length==0) 
          return null;
      return sortedArrayToBST(num, 0, num.length - 1);
              
      }
      
    static TreeNode sortedArrayToBST(int[] num, int start, int end){
         
        if(start>end) 
            return null;
        int mid = (end+start)/2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedArrayToBST(num, start, mid-1);
        root.right = sortedArrayToBST(num, mid+1,end);
        return root;
 
    
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

