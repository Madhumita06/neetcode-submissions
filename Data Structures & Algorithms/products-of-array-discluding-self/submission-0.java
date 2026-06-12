class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product =1, zerocount =0;
        for(int n : nums){
            if(n!=0){
                product*=n;
            }
            else{
                zerocount++;
            }
        }

        if(zerocount>1){
            return new int[nums.length];
        }

        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zerocount>0){
                result[i] = (nums[i]==0) ? product :0;
            }
            else{
                result[i] = product/nums[i];
            }
        }
        return result;
        
    }
}  
