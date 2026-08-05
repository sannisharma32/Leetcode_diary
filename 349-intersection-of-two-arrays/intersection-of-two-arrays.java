class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer>set= new HashSet<>();
        List<Integer>result= new ArrayList<>();

        for(int e:nums2){
            set.add(e);
        }

        for(int e:nums1){
            if(set.contains(e) && !result.contains(e)){
                result.add(e);            }
        }

        return result.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
        
    }
}