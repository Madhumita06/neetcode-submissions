// import java.util.*;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i=0; i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] == nums[j])
        //         {
        //         return true;
        //         }
                
        //     }
        // }
        // return false;
        Map<Integer, Integer> map =  new HashMap<>();
        for(int e:nums){
            map.put(e, map.getOrDefault(e,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}
