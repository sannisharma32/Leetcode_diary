class Solution {
      List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        back(n,k, 1, new ArrayList<>());
        return result;
        

    }

    void back(int n, int k, int start,List<Integer>curr ){

        if(curr.size()== k){
            result.add(new ArrayList<>(curr));
            return;

        }

        for(int i=start;i<=n;i++){
            curr.add(i);

            back(n,k, i+1, curr);
            curr.remove(curr.size()-1);
            
        }



    }



}