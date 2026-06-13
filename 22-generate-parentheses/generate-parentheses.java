class Solution {
    public List<String> generateParenthesis(int n) {
        
            List<String>result= new ArrayList<>();
            
            backtraking(n,0,0,result,new StringBuilder());
            return result;
        


    }
   void  backtraking(int n, int open, int close, List<String>result, StringBuilder path){

        if(path.length() == 2*n){
            result.add(path.toString());
            return;
        }


        if(open<n){
            path.append('(');
            backtraking(n,open+1,close,result,path);
             path.deleteCharAt(path.length() - 1);

        }
         if(close<open){
            path.append(')');
            backtraking(n,open,close+1,result,path);
             path.deleteCharAt(path.length() - 1);

        }





    }



}


