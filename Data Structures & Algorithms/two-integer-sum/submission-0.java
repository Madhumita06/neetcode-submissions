class Solution {
    public int[] twoSum(int[] nums, int target) {
    // for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //         if(nums[i] + nums[j ] == target && i!=j){
    //         return new int[]{i,j};
    //     }
    // }    
    // }
    // return null;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int num =  nums[i];
        int diff = target - num;
        if(map.containsKey(diff)){
            return new int[]{map.get(diff),i};
        }
        map.put(num,i);
    }

    return new int[]{};
    
    }
}
