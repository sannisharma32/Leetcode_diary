/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String>result= new ArrayList<>();
        
        dfs(root,result,"");
        return result;
        
    }

    void dfs(TreeNode root, List<String>result,String str){

        if(root== null){
            return ;
        }

        if(str.isEmpty()){
          str=  str.valueOf(root.val);
        }else{
            str=str+ "->"+root.val;
        }
       
       if(root.left== null && root.right==null){
        result.add(str);
        return ;
       }

      

       dfs(root.left,result,str);
        dfs(root.right,result,str);



    }
}