//Find max element in BT

public int maxInBinaryTree(TreeNode root) {
  int max_value = INTEGER.MIN_VALUE;
  
  if(!root == null) {
    int leftMax = maxInBinaryTree(root.left);
    int rightMax = maxInBinaryTree(root.right);
    
    if(leftMax > rightMax) max_value = leftMax;
    else max_value = rightMax;
    
    if(root.data > max_value) max_value = root.data;
    
   }
    return max_value;
}
