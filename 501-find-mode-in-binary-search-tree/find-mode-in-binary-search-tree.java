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
    public int[] findMode(TreeNode root) {
        

        Map<Integer,Integer>map = new HashMap<>();

        inorder(root,map);
        int maxval=0;

        for(int val:map.values()){
           maxval= Math.max(val, maxval);
        }

        List<Integer>list= new ArrayList<>();

        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue()== maxval){
                list.add(entry.getKey());
            }
        }
          return list.stream().mapToInt(i -> i).toArray();

        
    }


    void inorder(TreeNode root, Map<Integer,Integer>map){

        if(root== null){
            return;
        }

        inorder(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
         inorder(root.right,map);
    }
}