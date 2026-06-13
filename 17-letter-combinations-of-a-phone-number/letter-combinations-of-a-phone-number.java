class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>result= new ArrayList<>();

        if(digits=="" || digits.length() == 0){
            return new ArrayList();
            
        }

         String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };


        backtraking(digits,0,new StringBuilder(),map, result);
        
        return result;

        
    }
     void backtraking(String digits, int index, StringBuilder path, String []map, List<String>result){


        if(index == digits.length()){
            result.add(path.toString());
            return;
        }

        String letter=map[digits.charAt(index)-'0'];

        for(char ch: letter.toCharArray()){

        path.append(ch);


        backtraking(digits,index+1,path,map, result);

        path.deleteCharAt(path.length()-1);


        }




     }
}