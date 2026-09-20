class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashset1 = new HashSet<>();
        for(int num : nums1){
            hashset1.add(num);   
        }

        Set<Integer> hashset2 = new HashSet<>();
        for(int num : nums2){
            if(hashset1.contains(num)){
                hashset2.add(num);
            }
        }
        int[] ans = new int[hashset2.size()];

        int i = 0;

        for(int num : hashset2){
            ans[i] = num;
            i++; 
        }

        return ans;
    }
}