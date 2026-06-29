class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int count=0;

        for(String ptr:patterns){
            if(word.contains(ptr)){
                count++;
            }
        }
    return count;
        
    }
}