class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count =0, product = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count++;
            } else{
                product *= nums[i];
            }
        }
        if(count>1){
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(count>0){
                res[i] = (nums[i]==0) ? product :0;
            } else{
                res[i] = product/nums[i];
            }
        }
        return res;
    }
}  
